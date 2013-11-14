package com.frocent.common.utils;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

public class URLWrapper {
	
	private Map<String,String> params = new HashMap<String, String>();
	private String relativeUrl = "";
	private String uri;

	public static URLWrapper wrap(String uri) {
		
		URLWrapper urlWrapper = new URLWrapper();
		
		urlWrapper.uri = uri;
		
		if(StringUtils.isEmpty(uri)){
			throw new IllegalArgumentException("参数不能为空");
		}
		
		//不存在
		if(uri.indexOf("?")==-1){
			urlWrapper.setRelativeUrl(uri);
			return urlWrapper;
		}
		
		String queryString = StringUtils.split(uri, "?")[1];
		urlWrapper.setRelativeUrl(StringUtils.split(uri, "?")[0]);
		
		String[] queryArray = StringUtils.split(queryString, "&");
		for (String query : queryArray) {
			if(StringUtils.contains(query, "=")){
				String[] parts = StringUtils.split(query, "=");
				if(parts.length==2){
					urlWrapper.params.put(parts[0], parts[1]);					
				}
			}
		}			
		return urlWrapper;
	}

	public String getParamValue(String key) {
		return params.get(key);
	}

	public int getParamValueAsInt(String key) {
		return Integer.parseInt(params.get(key));
	}

	public String getRelativeUrl() {
		return relativeUrl;
	}

	public void setRelativeUrl(String relativeUrl) {
		this.relativeUrl = relativeUrl;
	}

	public String getUri() {
		return uri;
	}

}
