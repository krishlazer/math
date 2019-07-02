package com.krish.flashing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.krish.flashing.model.Brand;

@Controller
public class BrandController 
{
	
	@RequestMapping(value = "/greatbrands/loadbrandform", method = RequestMethod.POST)
	public ModelAndView loadBrandForm()
	{
		
		ModelAndView lbfmv = new ModelAndView("loadform");
		
		return lbfmv;
	}
	
	@RequestMapping(value = "/greatbrands/displaybrandform", method = RequestMethod.GET)
	public ModelAndView displayBrandForm(@ModelAttribute("dbform") Brand brand, )
	{
		
		
		
		
		return null;
	}
}
