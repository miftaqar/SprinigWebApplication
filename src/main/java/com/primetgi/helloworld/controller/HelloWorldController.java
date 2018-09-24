package com.primetgi.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/greet")
public class HelloWorldController {

	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
		ModelAndView modelAndView = new ModelAndView("helloworld");
		modelAndView
				.addObject("msg",
						"Welcome to Spring MVC Application, developed using spring annotations");
		return modelAndView;
	}
	
	@RequestMapping("/hi")
	public ModelAndView hiWorld() {
		ModelAndView modelAndView = new ModelAndView("helloworld");
		modelAndView
				.addObject("msg",
						"Welcome to Spring MVC Application, this is from hiWorld");
		return modelAndView;
	}
	
	@RequestMapping("/hi/country/{userName}")
	public ModelAndView displayMsgForRandomURL() {
		ModelAndView modelAndView = new ModelAndView("helloworld");
		modelAndView
				.addObject("msg",
						"Welcome to Spring MVC Application, this message is when passing random url");
		return modelAndView;
	}
	
	@RequestMapping("/hi/pathVar/{userName}")
	public ModelAndView displayMsgForpathURL(@PathVariable("userName") String name) {
		ModelAndView modelAndView = new ModelAndView("helloworld");
		modelAndView
				.addObject("msg",
						"Welcome to Spring MVC Application, pleased to meet with "+name);
		return modelAndView;
	}

}
