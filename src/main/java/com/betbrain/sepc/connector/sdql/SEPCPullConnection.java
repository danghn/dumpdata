package com.betbrain.sepc.connector.sdql;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.xml.stream.XMLStreamException;

import org.apache.log4j.Logger;

/**
 * SEPC Pull Connection (HTTP-based) 
 * 
 */
class SEPCPullConnection {
	
	// --------------------------------------------------------------------------------------------
    // Class fields
    // --------------------------------------------------------------------------------------------
	
	private static final String REQUEST_TYPE = "requestType";
	
	// --------------------------------------------------------------------------------------------
    // Instance fields
    // --------------------------------------------------------------------------------------------
	
	private String _publisherAppHost;
	private int _publisherAppPort;
	private SDQLXMLReaderUtil _sdqlxmlReaderUtil = new SDQLXMLReaderUtil();
	private List<PullConnectionListener> _listeners = new ArrayList<PullConnectionListener>();
	private long _requestTimeoutMillis = TimeUnit.MINUTES.toMillis(1L);
	private static final Logger _logger = Logger.getLogger(SEPCPullConnection.class);
	  
    // --------------------------------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------------------------------
	
	public SEPCPullConnection(String publisherAppHost, int publisherAppPort) {
		_publisherAppHost = publisherAppHost;
		_publisherAppPort = publisherAppPort;
	}
	
	public SEPCPullConnection(String publisherAppHost, int publisherAppPort, long requestTimeoutMillis) {
		_publisherAppHost = publisherAppHost;
		_publisherAppPort = publisherAppPort;
		_requestTimeoutMillis = requestTimeoutMillis;
	}

    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------
    
	public SDQLSubscribeResponse requestSubscribe(String subscriptionName)
			throws IOException, SDQLErrorException {
		Map<String, String> urlParams = new HashMap<String, String>();
		urlParams.put(PullConnectorParams.REQUEST_TYPE, PullConnectorParams.SUBSCRIBE_REQUEST);
		urlParams.put(PullConnectorParams.SUBSCRIPTION_SPECIFICATION_NAME, subscriptionName);
		return (SDQLSubscribeResponse)doRequest(urlParams);
	}
	
	/* ----------------------------------------------------------------------------------------- */
	
	public SDQLInitialData requestInitialData(String subscriptionId)
			throws IOException, SDQLErrorException {
		Map<String, String> urlParams = new HashMap<String, String>();
		urlParams.put(REQUEST_TYPE, PullConnectorParams.INITIAL_DATA_REQUEST);
		urlParams.put(PullConnectorParams.SUBSCRIPTION_ID, subscriptionId);
		return (SDQLInitialData)doRequest(urlParams);
	}
	
	/* ----------------------------------------------------------------------------------------- */
	
	public SDQLGetNextUpdateDataResponse requestUpdateData(String subscriptionId)
			throws IOException, SDQLErrorException {
		Map<String, String> urlParams = new HashMap<String, String>();
		urlParams.put(REQUEST_TYPE, PullConnectorParams.NEXT_UPDATE_REQUEST);
		urlParams.put(PullConnectorParams.SUBSCRIPTION_ID, subscriptionId);
		return (SDQLGetNextUpdateDataResponse) doRequest(urlParams);
	}
	
	/* ----------------------------------------------------------------------------------------- */
	
	public SDQLGetNextUpdateDataResponse requestResumeUpdateData(String subscriptionId, String subscriptionName,
			long lastAppliedEntityChangeBatchId) throws IOException, SDQLErrorException {
		Map<String, String> urlParams = new HashMap<String, String>();
		urlParams.put(REQUEST_TYPE, PullConnectorParams.RESUME_UPDATE_REQUEST);
		urlParams.put(PullConnectorParams.SUBSCRIPTION_ID, subscriptionId);
		urlParams.put(PullConnectorParams.SUBSCRIPTION_SPECIFICATION_NAME, subscriptionName);
		urlParams.put(PullConnectorParams.LAST_BATCH_ID, String.valueOf(lastAppliedEntityChangeBatchId));
		return (SDQLGetNextUpdateDataResponse) doRequest(urlParams);
	}
	
	/* ----------------------------------------------------------------------------------------- */
	
	public SDQLUnsubscribeResponse requestUnsubscribe(String subscriptionId, String subscriptionName)
			throws IOException, SDQLErrorException {
		Map<String, String> urlParams = new HashMap<String, String>();
		urlParams.put(PullConnectorParams.REQUEST_TYPE, PullConnectorParams.UNSUBSCRIBE_REQUEST);
		urlParams.put(PullConnectorParams.SUBSCRIPTION_SPECIFICATION_NAME, subscriptionName);
		urlParams.put(PullConnectorParams.SUBSCRIPTION_ID, subscriptionId);
		return (SDQLUnsubscribeResponse) doRequest(urlParams);
	}
	
	/* ----------------------------------------------------------------------------------------- */
	
	public void addListener(PullConnectionListener listener) {
		_listeners.add(listener);
	}
	
	/* ----------------------------------------------------------------------------------------- */
	
	public void removeListener(PullConnectionListener listener) {
		_listeners.remove(listener);
	}
	
	/* ----------------------------------------------------------------------------------------- */

	public void setRequestTimeoutMillis(long requestTimeoutMillis) {
		_requestTimeoutMillis = requestTimeoutMillis;
	}

	/* ----------------------------------------------------------------------------------------- */
	
	private SDQLConstruct doRequest(Map<String, String> urlParams)
			throws IOException, SDQLErrorException {
		try {
			String url = buildUrl(urlParams);
			URL sportsPublisherUrl = new URL(url);
			_logger.debug("Requesting url: " + url);
			HttpURLConnection urlConnection = (HttpURLConnection) sportsPublisherUrl
					.openConnection();
			urlConnection.setConnectTimeout((int)_requestTimeoutMillis);
			urlConnection.setReadTimeout((int)_requestTimeoutMillis);
			urlConnection.setRequestMethod("GET");
			urlConnection.connect();
			int statusCode = urlConnection.getResponseCode();
			if (statusCode != HttpURLConnection.HTTP_OK) {
				notifyListenersOfError(statusCode);
				throw new IOException("Bad HTTP Response, Status Code is: " + statusCode);
			}
			SDQLConstruct sdqlConstruct = _sdqlxmlReaderUtil.readPDUFromPullStream(urlConnection.getInputStream());
			if (sdqlConstruct instanceof SDQLError) {
				notifyListenersOfError((SDQLError)sdqlConstruct);
				throw new SDQLErrorException((SDQLError)sdqlConstruct);
			} 
			notifyListenersOfSuccess(sdqlConstruct);
			return sdqlConstruct;
		} catch (IOException e) {
			notifyListenersOfFailure(e);
			throw e;
		} catch (XMLStreamException e) {
			notifyListenersOfFailure(e);
			throw new IOException(e);
		} 
	}
	
	
	
	/* ----------------------------------------------------------------------------------------- */
	
	private void notifyListenersOfFailure(Exception e) {
		for (PullConnectionListener listener : _listeners) {
			listener.requestFailed(e);
		}
	}
	
	/* ----------------------------------------------------------------------------------------- */
	
	private void notifyListenersOfError(int statusCode) {
		for (PullConnectionListener listener : _listeners) {
			listener.requestError(statusCode);
		}
	}
	
	/* ----------------------------------------------------------------------------------------- */
	
	private void notifyListenersOfError(SDQLError sdqlError) {
		for (PullConnectionListener listener : _listeners) {
			listener.responseError(sdqlError);
		}
	}
	
	/* ----------------------------------------------------------------------------------------- */
		
	private void notifyListenersOfSuccess(SDQLConstruct resultSdqlConstruct) {
		for (PullConnectionListener listener : _listeners) {
			listener.requestSuccess(resultSdqlConstruct);
		}
	}
	
	/* ----------------------------------------------------------------------------------------- */
	
	private String buildUrl(Map<String, String> params) {
		StringBuffer urlBuffer = new StringBuffer();
		urlBuffer.append("http://").append(_publisherAppHost).append(":")
				.append(_publisherAppPort).append("/xmlfeed");
		if (params != null && !params.isEmpty()) {

			urlBuffer.append("?");
			for (String paramName : params.keySet()) {
				urlBuffer.append(paramName);
				urlBuffer.append("=");
				urlBuffer.append(params.get(paramName));
				urlBuffer.append("&");
			}
			return urlBuffer.substring(0, urlBuffer.length() - 1);
		} else {
			return urlBuffer.toString();
		}
	}
	
	/* ----------------------------------------------------------------------------------------- */

    public String toString() {

        StringBuffer sb = new StringBuffer();
        sb.append(getClass().getSimpleName());
        sb.append("(publisherAppHost=");
        sb.append(_publisherAppHost);
        sb.append(",publisherAppPort=");
        sb.append(_publisherAppPort);
        sb.append(")");
    
        return sb.toString();
    }
 
}
