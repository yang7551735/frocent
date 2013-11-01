package com.frocent.webspider.view.action;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.frocent.common.utils.PagedList;
import com.frocent.common.utils.SearchFilter;
import com.frocent.webspider.domain.Website;
import com.frocent.webspider.manager.WebsiteManager;

@Controller
public class WebsiteController {
	
	@Autowired
	private WebsiteManager websiteManager;
	
	@RequestMapping(value="/webspider/website/list")
	public ModelAndView list(HttpServletRequest request,Website website){
		SearchFilter searchFilter = SearchFilter.getDefault();
		PagedList<Website> websites= websiteManager.paged(searchFilter);
		Map<String,Object> model = new HashMap<String,Object>();
		model.put("websites", websites);
		return new ModelAndView("webspider/website/list",model);
	}

}
