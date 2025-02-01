package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.entity.User;
import com.example.services.EmailServices;

public class LoginController {

	
	 @Autowired
	    private EmailServices emailService;
	 
	 
	 @GetMapping("/")
		public String loadForm(Model model) {
			User userobj = new User();
			model.addAttribute("user", userobj);
			return "index";
		}

	    @PostMapping("/user")
	    public String handleLogin(@RequestParam("email") String email) {
	        emailService.sendLoginSuccessEmail(email);
	        return "redirect:/sucess";
	    }
}
