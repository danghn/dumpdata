package com.betbrain.sepc.connector.sdql;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents an SDQL Next Update Data Response
 * 
 *  
 */
public class SDQLGetNextUpdateDataResponse extends SDQLConstruct {
	
	private List<SDQLUpdateData> _sdqlUpdateDataList = new ArrayList<SDQLUpdateData>();
	
	/* ----------------------------------------------------------------------------------------- */
	
	public void add(SDQLUpdateData sdqlUpdateData) {
		_sdqlUpdateDataList.add(sdqlUpdateData);
	}
	
	/* ----------------------------------------------------------------------------------------- */
	
	public List<SDQLUpdateData> getSDQLUpdateDataList() {
		return _sdqlUpdateDataList;
	}
	
	/* ----------------------------------------------------------------------------------------- */

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(#updates=");
        sb.append(_sdqlUpdateDataList.size());
        sb.append(": \n");
        for (SDQLUpdateData sdqlUpdateData : _sdqlUpdateDataList) {
        	sb.append(sdqlUpdateData);
        	sb.append("\n");
        }
        sb.append(")");
        return sb.toString();
    }
	
}
