package com.frocent.webspider.view.action;

import com.frocent.common.utils.SearchFilter;
import com.frocent.webspider.manager.BaseManager;

public class BaseAction<T> {
	
	private BaseManager<T> baseManager;
	
	private String listView;
	
	public String list(){
		SearchFilter searchFilter = SearchFilter.getDefault();
		baseManager.paged(searchFilter);
		return listView;
	}

}
