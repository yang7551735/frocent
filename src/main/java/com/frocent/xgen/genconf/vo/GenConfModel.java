package com.frocent.xgen.genconf.vo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 核心框架配置的Model
 * @author Administrator
 *
 */
public class GenConfModel {
	/**
	 * 
	 */
	private List<NeedGenModel> needGens = new ArrayList<NeedGenModel>();
	/**
	 * 外部主题的Model
	 */
	private List<ThemeModel> themes = new ArrayList<ThemeModel>();
	/**
	 * 描述通用的常量定义的集合
	 */
	private Map<String,String> mapConstants = new HashMap<String,String>();
	/**
	 * @return the needGens
	 */
	public List<NeedGenModel> getNeedGens() {
		return needGens;
	}
	/**
	 * @param needGens the needGens to set
	 */
	public void setNeedGens(List<NeedGenModel> needGens) {
		this.needGens = needGens;
	}
	/**
	 * @return the themes
	 */
	public List<ThemeModel> getThemes() {
		return themes;
	}
	/**
	 * @param themes the themes to set
	 */
	public void setThemes(List<ThemeModel> themes) {
		this.themes = themes;
	}
	/**
	 * @return the mapConstants
	 */
	public Map<String, String> getMapConstants() {
		return mapConstants;
	}
	/**
	 * @param mapConstants the mapConstants to set
	 */
	public void setMapConstants(Map<String, String> mapConstants) {
		this.mapConstants = mapConstants;
	}
	
}
