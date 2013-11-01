package com.frocent.webspider.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import com.frocent.common.utils.PagedList;
import com.frocent.common.utils.SearchFilter;

@Component("baseDao")
public class BaseDaoImpl implements BaseDao{

	@Resource(name="sessionFactory") 
	private SessionFactory sessionFactory;

	public <T> PagedList<T> paged(Class<T> clazz, SearchFilter searchFilter) {
		Session session = sessionFactory.getCurrentSession();
		String hql = searchFilter.buildPagedHql(clazz);
		Query query = session.createQuery(hql);
		query.setFirstResult(searchFilter.getFirstResult());
		query.setMaxResults(searchFilter.getPageSize());
		searchFilter.setParamter(query);
		@SuppressWarnings("unchecked")
		List<T> results = query.list();
		return new PagedList<T>(results,searchFilter.getPageNo(),searchFilter.getPageSize());
	}

	public <T> List<T> list(Class<T> clazz, SearchFilter searchFilter) {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> T get(Class<T> t, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> void addNew(Class<T> clazz, T t) {
		// TODO Auto-generated method stub
		
	}

	public <T> void update(Class<T> clazz, T t) {
		// TODO Auto-generated method stub
		
	}

	public <T> void delete(Class<T> clazz, T t) {
		// TODO Auto-generated method stub
		
	}
	
}
