package com.frocent.webspider.manager;

import java.util.List;

import com.frocent.webspider.dao.BaseDao;
import com.frocent.webspider.utils.PagedList;
import com.frocent.webspider.utils.SearchFilter;

public class BaseManagerImpl<T> implements BaseManager<T> {

	private BaseDao<T> baseDao;
	
	public PagedList<T> paged(SearchFilter searchFilter) {
		return baseDao.paged(searchFilter);
	}

	public List<T> list(SearchFilter searchFilter) {
		return baseDao.list(searchFilter);
	}

	public T get(int id) {
		return baseDao.get(id);
	}

	public void addNew(T t) {
		baseDao.addNew(t);
	}

	public void update(T t) {
		baseDao.update(t);
	}

	public void delete(T t) {
		baseDao.delete(t);
	}

}
