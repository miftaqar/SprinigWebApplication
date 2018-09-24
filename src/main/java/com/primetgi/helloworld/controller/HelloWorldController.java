package com.primetgi.helloworld.controller;

import java.util.Map;

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
	
	@RequestMapping("/hi/{countryName}/{userName}")
	public ModelAndView displayNameWithCountry(@PathVariable("userName") String name, @PathVariable("countryName") String countryName) {
		ModelAndView modelAndView = new ModelAndView("helloworld");
		modelAndView
				.addObject("msg",
						"Hello "+name+", and you are from "+countryName);
		return modelAndView;
	}
	
	@RequestMapping("/hi/{state}/{city}/{userName}")
	public ModelAndView displayNameWithStateCity(@PathVariable Map<String, String> pathVars) {
		String stateName = pathVars.get("state");
		String cityName = pathVars.get("city");
		String name = pathVars.get("userName");
		
		ModelAndView modelAndView = new ModelAndView("helloworld");
		modelAndView
				.addObject("msg",
						"Hello "+name+", and you belongs "+stateName+" state and to the "+cityName+" city");
		return modelAndView;
	}

}
