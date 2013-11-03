package com.frocent.webspider.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="webspider_article")  
public class Article extends BaseEntity{

	private int refId; 

	private String title;
	
	private String content;
	
	private String usernick;
	
	private String userId;

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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getUsernick() {
		return usernick;
	}

	public void setUsernick(String usernick) {
		this.usernick = usernick;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
}
