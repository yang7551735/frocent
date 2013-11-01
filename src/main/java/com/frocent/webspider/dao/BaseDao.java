package com.frocent.webspider.dao;

import java.util.List;

import com.frocent.common.utils.PagedList;
import com.frocent.common.utils.SearchFilter;

public interface BaseDao {
	
	<T> PagedList<T> paged(Class<T> clazz,SearchFilter searchFilter);
	
	<T> List<T> list(Class<T> clazz,SearchFilter searchFilter);
	
	<T> T get(Class<T> t,int id);
	
	<T> void addNew(Class<T> clazz,T t);
	
	<T> void update(Class<T> clazz,T t);
	
	<T> void delete(Class<T> clazz,T t);
}
