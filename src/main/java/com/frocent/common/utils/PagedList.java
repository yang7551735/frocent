package com.frocent.common.utils;

import java.util.List;

public class PagedList<T> {
	
	private int pageNo;
	
	private int pageSize;
	
	private List<T> results;

	public PagedList(List<T> results, int pageNo, int pageSize) {
		super();
		this.results = results;
		this.pageNo = pageNo;
		this.pageSize = pageSize;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public List<T> getResults() {
		return results;
	}

	public void setResults(List<T> results) {
		this.results = results;
	}

	
}
