package com.frocent.webspider.view.action;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.frocent.webspider.domain.Website;
import com.frocent.webspider.manager.WebsiteManager;

@Controller
public class WebsiteFormController {

	private WebsiteManager websiteManager;
	@RequestMapping(method=RequestMethod.POST)
	public String dealForm(@Valid Website website,BindingResult bindingResult){
		if(bindingResult.hasErrors()){
			return "webspider/website/form";
		}
		websiteManager.addNew(website);
		return "webspider/website/list";
	}
	
}
