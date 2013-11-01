package com.frocent.common.utils;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;

public class SearchFilter {

	List<Condition> conditions = new ArrayList<Condition>();
	
	private int pageSize = 20;
	
	private int pageNo = 1;
	
	private SearchFilter(){
		
	}
	
	public static SearchFilter getDefault(){
		return new SearchFilter();
	}
	
	public static SearchFilter getPagedFilter(int pageNo,int pageSize){
		SearchFilter searchFilter = new SearchFilter();
		searchFilter.pageNo = pageNo;
		searchFilter.pageSize = pageSize;
		return searchFilter;
	}

	public int getFirstResult() {
		return (pageNo-1)*pageSize;
	}

	public int getPageSize() {
		return pageSize;
	}

	public int getPageNo() {
		return pageNo;
	}
	
	
	public <T> String buildPagedHql(Class<T> clazz) {
		StringBuilder hqlBuilder = new StringBuilder();
		hqlBuilder.append("FROM ").append(clazz.getSimpleName());
		if(!conditions.isEmpty()){
			hqlBuilder.append( "where ");
			for (Condition condition : conditions) {
				hqlBuilder.append(condition.buildWhereItemHql());
			}
		}
		return hqlBuilder.toString();
	}
	
	public void setParamter(Query query) {
		for (int index = 0; index < conditions.size(); index++) {
			Condition condition = conditions.get(index);
			condition.setParamter(query,index);
		}
	}
	
	private class Condition{
		String attribute;
		Operator operator;
		Object value;
		public String buildWhereItemHql() {
			return new StringBuilder(attribute).append(operator.getModifer()).append("? ").toString();
		}
		public void setParamter(Query query,int index) {
			query.setParameter(index, value);
		}
	}
	
	private enum Operator{
		EQUAL("=");
		private String modifer;
		Operator(String modifer){
			this.modifer = modifer;
		}
		public String getModifer() {
			return modifer;
		}
	}


	
}
