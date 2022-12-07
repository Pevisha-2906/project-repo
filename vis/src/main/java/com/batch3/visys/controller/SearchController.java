package com.batch3.visys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.batch3.visys.constants.ApplicationConstants;
import com.batch3.visys.dao.SearchDAO;
import com.batch3.visys.model.SearchModel;
import com.batch3.visys.model.UserModel;

@Controller
public class SearchController {

	@Autowired
	SearchDAO searchDAO;
	
	@RequestMapping(value = "/search/searchProcess")
	public ModelAndView searchProcess(@ModelAttribute("search") SearchModel search) {
		ModelAndView mav = new ModelAndView(ApplicationConstants.MASTER_PAGE);
		mav.addObject("userClicksSearch", true);
		SearchModel nSearchModel = new SearchModel();
		nSearchModel.setUsername(search.getUsername());
		nSearchModel.setLicenceNo(search.getLicenceNo());
		nSearchModel.setPlateNo(search.getPlateNo());
		mav.addObject("searchResult", searchDAO.searchResult(search));
		mav.addObject("search", nSearchModel);
		mav.addObject(ApplicationConstants.TITLE, ApplicationConstants.SEARCH);
		return mav;
	}
}
