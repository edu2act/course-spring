package com.myschool;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	@RequestMapping("/helloworld")
	public String helloWorld(Model model){
		model.addAttribute("message", "Hello World!");
		return "HelloWorld";
	}
}
