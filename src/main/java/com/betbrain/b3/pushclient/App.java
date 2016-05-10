package com.betbrain.b3.pushclient;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.betbrain.sepc.connector.sdql.SEPCConnector;
import com.betbrain.sepc.connector.sdql.SEPCPushConnector;

/**
 * Hello world!
 *
 */
public class App {
	//private static EntityManager em;
	public static void main(String[] args) {
		// EntityManagerFactory emf = Persistence.createEntityManagerFactory("BetBrainService");
	     //em = emf.createEntityManager();
		System.out.println("Hello B3!");
		SEPCConnector pushConnector = new SEPCPushConnector("sept.betbrain.com", 7000);
		//pushConnector.addConnectorListener(new InitialPushListener());
		pushConnector.addConnectorListener(new PushListener());
		pushConnector.setEntityChangeBatchProcessingMonitor(new BatchMonitor());
		pushConnector.start("OddsHistory");
		//pushConnector.stop();
	}
}
