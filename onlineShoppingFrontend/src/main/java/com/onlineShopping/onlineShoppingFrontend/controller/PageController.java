package com.onlineShopping.onlineShoppingFrontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value={"/","/home","/index"})
	public ModelAndView index()
	{
		System.out.println(" inside the pagecontroller !!!");
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", "Spring MVC Welcome!!!");
		return mv;
	}
	
	/*@RequestMapping(value={"/test"})
	public ModelAndView test(@RequestParam("greeting") String greeting)
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", greeting);
		return mv;
	}*/
	
	@RequestMapping(value={"/test/{greeting}"})
	public ModelAndView test(@PathVariable("greeting") String greeting)
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", greeting);
		return mv;
	}
}
