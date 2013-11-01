package com.frocent.webspider.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.frocent.common.utils.PagedList;
import com.frocent.common.utils.SearchFilter;
import com.frocent.webspider.dao.BaseDao;

public abstract class BaseManagerImpl<T> implements BaseManager<T> {

	@Autowired
	private BaseDao baseDao;
	
	public abstract Class<T> getClassType();
	
	public PagedList<T> paged(SearchFilter searchFilter) {
		return baseDao.paged(getClassType() ,searchFilter);
	}

	public List<T> list(SearchFilter searchFilter) {
		return baseDao.list(getClassType(),searchFilter);
	}

	public T get(int id) {
		return baseDao.get(getClassType(),id);
	}

	public void addNew(T t) {
		baseDao.addNew(getClassType(),t);
	}

	public void update(T t) {
		baseDao.update(getClassType(),t);
	}

	public void delete(T t) {
		baseDao.delete(getClassType(),t);
	}

}
