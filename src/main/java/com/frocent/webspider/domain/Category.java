package com.frocent.webspider.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="webspider_category")  
public class Category extends BaseEntity{
	
	private int refId;
	
	private String title;
	
	private String urlLink;
	
	private int siteId;

	public int getRefId() {
		return refId;
	}

	public void setRefId(int refId) {
		this.refId = refId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getSiteId() {
		return siteId;
	}

	public void setSiteId(int siteId) {
		this.siteId = siteId;
	}

	public String getUrlLink() {
		return urlLink;
	}

	public void setUrlLink(String urlLink) {
		this.urlLink = urlLink;
	}

}
