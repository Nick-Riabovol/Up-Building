package com.upbuilding.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.upbuilding.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService; // use in methods
	
	@RequestMapping("/")
	public String home() {
		return "redirect:/index";
	}
	
	// TODO realisation ...
}