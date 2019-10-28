package com.zain.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	@RequestMapping(value={"/","/home","/index"})
	public ModelAndView index(){
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting","wel come to spring web mvc");
		return mv;
	}
	
/*	@RequestMapping(value="/testParam")
	public ModelAndView index(@RequestParam(value="greeting", required=false) String greeting){
		if(greeting==null){
			greeting="hello greeting";
		}
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting",greeting);
		return mv;
	}*/

	@RequestMapping(value="/test/{greeting}")
	public ModelAndView index(@PathVariable("greeting") String greeting){
		if(greeting==null){
			greeting="hello greeting";
		}
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting",greeting);
		return mv;
	}

}
