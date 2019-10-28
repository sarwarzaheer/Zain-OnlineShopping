package com.zain.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.zain.onlineshopping.dao.CategoryDAO;
import com.zain.onlineshopping.dto.Category;

@Controller
public class PageController {
	
	@Autowired
	private CategoryDAO categoryDAO; 
	
	@RequestMapping(value={"/","/home","/index"})
	public ModelAndView index(){
		ModelAndView mv = new ModelAndView("page");
		
		// passing the category list
		mv.addObject("categories",categoryDAO.list());
		mv.addObject("title","Home");
		mv.addObject("userClickHome",true); 
		return mv;
	}
	
	@RequestMapping(value="/about")
	public ModelAndView about(){
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","About Us");
		mv.addObject("userClickAbout",true); 
		return mv;
	}
 
	@RequestMapping(value="/contact")
	public ModelAndView contact(){
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Contact Us");
		mv.addObject("userClickContact",true); 
		return mv;
	}
	
	@RequestMapping(value="/show/all/products")
	public ModelAndView showAllProducts(){
		ModelAndView mv = new ModelAndView("page");
		
		// passing the category list
		mv.addObject("categories",categoryDAO.list());
		mv.addObject("title","All Products");
		mv.addObject("userClickAllProducts",true); 
		return mv;
	}
	
	@RequestMapping(value="/show/category/{id}/products")
	public ModelAndView showCategoryProducts(@PathVariable("id") int id){
		ModelAndView mv = new ModelAndView("page");
		Category category=null;
		
		category=categoryDAO.get(id); 
		
		// passing the category list
		mv.addObject("categories",categoryDAO.list());
		mv.addObject("category",category);
		mv.addObject("title",category.getName());
		mv.addObject("userClickCategoryProduct",true); 
		return mv;
	}

}
