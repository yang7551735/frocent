package com.frocent.webspider.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="webspider_website")  
public class Website {

    @Id  
    @GeneratedValue(strategy=GenerationType.AUTO)  
    private int id;
	
    @Size(max=256,min=1,message="siteurl is valid")
	private String siteurl;
    
    @Size(max=256,min=1,message="homepage is valid")
    private String homepage;
    
    @Size(max=256,min=1,message="useragent is valid")
    private String useragent;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSiteurl() {
		return siteurl;
	}

	public void setSiteurl(String siteurl) {
		this.siteurl = siteurl;
	}

	public String getHomepage() {
		return homepage;
	}

	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}

	public String getUseragent() {
		return useragent;
	}

	public void setUseragent(String useragent) {
		this.useragent = useragent;
	}
	
}
