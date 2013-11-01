package com.frocent.webspider.dao;

import java.util.List;

import com.frocent.common.utils.PagedList;
import com.frocent.common.utils.SearchFilter;

public interface BaseDao<T> {
	
	PagedList<T> paged(SearchFilter searchFilter);
	
	List<T> list(SearchFilter searchFilter);
	
	T get(int id);
	
	void addNew(T t);
	
	void update(T t);
	
	void delete(T t);
}
