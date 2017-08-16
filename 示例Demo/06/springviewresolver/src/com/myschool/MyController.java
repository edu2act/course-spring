package com.myschool;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@RequestMapping("hi")
	public String sayHi(Model model){
		model.addAttribute("message", "hi");
		return "HelloWorld";
	}
	
	@RequestMapping("testController")
	public String test(Model model){
		model.addAttribute("message", "TestMessage");
		return "test";
	}
}
