package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class msgController {

	@GetMapping("/welcome")
	public ModelAndView getmassage() {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg","welcome to ashokit");
		mav.setViewName("index");
		
		return mav;
	}
	@GetMapping("/deom")
	public ModelAndView getmassage2() {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg","good morning");
		mav.setViewName("index");
		
		return mav;
	}
}
