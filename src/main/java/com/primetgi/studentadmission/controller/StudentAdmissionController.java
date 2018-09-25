package com.primetgi.studentadmission.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {

	@RequestMapping(value = "/admissionForm.html", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() {
		ModelAndView modelAndView = new ModelAndView("admissionForm");
		return modelAndView;
	}

	@RequestMapping(value = "/submitAdmissionForm.html", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(
			@RequestParam("studentName") String name,
			@RequestParam("studentHobby") String hobby) {
		ModelAndView modelAndView = new ModelAndView("admissionSuccess");
		modelAndView.addObject("message", "Here are your details, Name: "
				+ name + " and your Hobby: " + hobby);
		return modelAndView;
	}
}
