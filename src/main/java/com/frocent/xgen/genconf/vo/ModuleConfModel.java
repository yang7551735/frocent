package com.frocent.xgen.genconf.vo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ModuleConfModel {

	private String modelId="";
	
	private String useTheme = "";
	
	private Map<String,ExtendConfModel> mapExtends = new HashMap<String, ExtendConfModel>(); 
	
	private Map<String,List<String>> mapNeedGendTypes = new HashMap<String,List<String>>();

	/**
	 * @return the modelId
	 */
	public String getModelId() {
		return modelId;
	}

	/**
	 * @param modelId the modelId to set
	 */
	public void setModelId(String modelId) {
		this.modelId = modelId;
	}

	/**
	 * @return the useTheme
	 */
	public String getUseTheme() {
		return useTheme;
	}

	/**
	 * @param useTheme the useTheme to set
	 */
	public void setUseTheme(String useTheme) {
		this.useTheme = useTheme;
	}

	/**
	 * @return the mapExtends
	 */
	public Map<String, ExtendConfModel> getMapExtends() {
		return mapExtends;
	}

	/**
	 * @param mapExtends the mapExtends to set
	 */
	public void setMapExtends(Map<String, ExtendConfModel> mapExtends) {
		this.mapExtends = mapExtends;
	}

	/**
	 * @return the mapNeedGendTypes
	 */
	public Map<String, List<String>> getMapNeedGendTypes() {
		return mapNeedGendTypes;
	}

	/**
	 * @param mapNeedGendTypes the mapNeedGendTypes to set
	 */
	public void setMapNeedGendTypes(Map<String, List<String>> mapNeedGendTypes) {
		this.mapNeedGendTypes = mapNeedGendTypes;
	}
	
}
