package com.myschool.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		System.out.println("login");
		return "loginok";
	}
	
	@RequestMapping("/{symbolicName:[a-z]}")
	public String reg(@PathVariable String symbolicName, @PathVariable String extension){
		System.out.println(symbolicName);
//		System.out.println(extension);
		return "";
	}
}
