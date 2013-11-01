package com.frocent.webspider.dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.frocent.common.utils.PagedList;
import com.frocent.common.utils.SearchFilter;

public class BaseDaoImpl<T> implements BaseDao<T>{

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	private Class<T> clazz;
	
	public PagedList<T> paged(final SearchFilter searchFilter) {
		@SuppressWarnings("unchecked")
		List<T> results =  hibernateTemplate.executeFind(new HibernateCallback<List<T>>() {
			public List<T> doInHibernate(Session session) throws HibernateException,
					SQLException {
				String hql = searchFilter.buildPagedHql(clazz);
				Query query = session.createQuery(hql);
				query.setFirstResult(searchFilter.getFirstResult());
				query.setMaxResults(searchFilter.getPageSize());
				searchFilter.setParamter(query);
				return query.list();
			}
		});
		
		return new PagedList<T>(results,searchFilter.getPageNo(),searchFilter.getPageSize());
	}

	public List<T> list(SearchFilter searchFilter) {
		return null;
	}

	public T get(int id) {
		return null;
	}

	public void addNew(T t) {
		
	}

	public void update(T t) {
		
	}

	public void delete(T t) {
		
	}

}
