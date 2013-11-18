package com.frocent.xgen.genconf.vo;

import java.util.HashMap;
import java.util.Map;

public class NeedGenModel {

	private String id;
	
	private String provider;
	
	private String theme;
	
	private Map<String,String> mapParam = new HashMap<String,String>();

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the provider
	 */
	public String getProvider() {
		return provider;
	}

	/**
	 * @param provider the provider to set
	 */
	public void setProvider(String provider) {
		this.provider = provider;
	}

	/**
	 * @return the theme
	 */
	public String getTheme() {
		return theme;
	}

	/**
	 * @param theme the theme to set
	 */
	public void setTheme(String theme) {
		this.theme = theme;
	}

	/**
	 * @return the mapParam
	 */
	public Map<String, String> getMapParam() {
		return mapParam;
	}

	/**
	 * @param mapParam the mapParam to set
	 */
	public void setMapParam(Map<String, String> mapParam) {
		this.mapParam = mapParam;
	}
	
}
