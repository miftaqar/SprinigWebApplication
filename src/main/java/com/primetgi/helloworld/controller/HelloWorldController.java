package com.primetgi.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	String message = "Welcome to Spring MVC";

	@RequestMapping("/hello")
	public ModelAndView showMessage(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		System.out.println("In Controller");

		ModelAndView modelViewObj = new ModelAndView("helloworld");
		modelViewObj.addObject("message", message);
		modelViewObj.addObject("name", name);
		return modelViewObj;
	}
}
