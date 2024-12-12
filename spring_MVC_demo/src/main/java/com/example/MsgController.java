package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MsgController {
	
	@GetMapping("/welcome")
	public ModelAndView getwelcomemsg() {
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("mgs","welcome to ashokit");
		
		mav.setViewName("index");
		
		return mav;
	}

}
