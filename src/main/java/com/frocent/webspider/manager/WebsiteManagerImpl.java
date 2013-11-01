package com.frocent.webspider.manager;

import org.springframework.stereotype.Component;

import com.frocent.webspider.domain.Website;

@Component("websiteManager")
public class WebsiteManagerImpl extends BaseManagerImpl<Website> implements WebsiteManager{

	@Override
	public Class<Website> getClassType() {
		return Website.class;
	}
	
}
