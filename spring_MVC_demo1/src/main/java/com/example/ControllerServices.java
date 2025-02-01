package com.example.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Services.userServices;
import com.example.entity.user;


@Controller
public class ControllerServices {

	@Autowired
	private userServices userServices;
	
	
	@GetMapping("/")
	public String loadForm(Model model) {
		user userobj = new user();
		model.addAttribute("user", userobj);
		return "index";
	}

	@GetMapping("/edit-user")
	public String editUser(@RequestParam("userId")Integer userId,  Model model) {
		
		user userById = userServices.getUserById(userId);
		model.addAttribute("user", userById);
		return "index";
	}

	@PostMapping("/user")
	public String handelSumbit(
			user User,
			BindingResult result,	
			Model model) {
		

		if(result.hasErrors()) {
			return "index";
		}
		boolean isSaved = userServices.saveUser(User);
		
		if(isSaved) {
			model.addAttribute("smsg", "user Saved");
		}
		else {
			model.addAttribute("emsg", "user is not saved");
		}
	
		return "index";
	}

	@GetMapping("/users")
	public String getUser(Model model) {
      
		List<user> allUsers = userServices.getAllUsers();
		model.addAttribute("users", allUsers);
		return "users";
	}
	
	@GetMapping("/delete-user")
	public String deleteUser(@RequestParam("userId") Integer userId,Model model) {
		
		boolean status = userServices.deleteUserById(userId);
		
		if(status) {
			model.addAttribute("msg","user deleted");
			List<user> allUsers = userServices.getAllUsers();
			model.addAttribute("users",allUsers);
		}
		else {
			model.addAttribute("emg", "fail to delete users");
		}
		return "users";
	}
	
}
