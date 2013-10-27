package com.frocent.webspider.view.action;

import com.frocent.webspider.manager.BaseManager;
import com.frocent.webspider.utils.SearchFilter;

public class BaseAction<T> {
	
	private BaseManager<T> baseManager;
	
	private String listView;
	
	public String list(){
		SearchFilter searchFilter = SearchFilter.getDefault();
		baseManager.paged(searchFilter);
		return listView;
	}

}
