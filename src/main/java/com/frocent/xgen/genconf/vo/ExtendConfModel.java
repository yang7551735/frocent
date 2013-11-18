package com.frocent.xgen.genconf.vo;

public class ExtendConfModel {

	private String id;
	
	private String value;
	
	private String[] values;
	
	private boolean single = true;

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
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * @return the values
	 */
	public String[] getValues() {
		return values;
	}

	/**
	 * @param values the values to set
	 */
	public void setValues(String[] values) {
		this.values = values;
	}

	/**
	 * @return the single
	 */
	public boolean isSingle() {
		return single;
	}

	/**
	 * @param single the single to set
	 */
	public void setSingle(boolean single) {
		this.single = single;
	}
	
	
}
