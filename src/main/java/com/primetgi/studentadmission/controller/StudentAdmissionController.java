package com.primetgi.studentadmission.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.primetgi.studentadmission.model.Student;

@Controller
public class StudentAdmissionController {

	@RequestMapping(value = "/admissionForm.html", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() {
		ModelAndView modelAndView = new ModelAndView("admissionForm");
		return modelAndView;
	}

	// @RequestMapping(value = "/submitAdmissionForm.html", method =
	// RequestMethod.POST)
	// public ModelAndView submitAdmissionForm(
	// @RequestParam(value = "studentName", defaultValue = "Mohd Ifteqar Ahmed")
	// String name,
	// @RequestParam("studentHobby") String hobby) {
	// ModelAndView modelAndView = new ModelAndView("admissionSuccess");
	// modelAndView.addObject("message", "Here are your details, Name: "
	// + name + " and your Hobby: " + hobby);
	// return modelAndView;
	// }

	// @RequestMapping(value = "/submitAdmissionForm.html", method =
	// RequestMethod.POST)
	// public ModelAndView submitAdmissionForm(
	// @RequestParam Map<String, String> reqPar) {
	// String name = reqPar.get("studentName");
	// String hobby = reqPar.get("studentHobby");
	//
	// ModelAndView modelAndView = new ModelAndView("admissionSuccess");
	// modelAndView.addObject("message", "Here are your details, Name: "
	// + name + " and your Hobby: " + hobby);
	// return modelAndView;
	// }

	@RequestMapping(value = "/submitAdmissionForm.html", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(
			@RequestParam(value = "studentName", defaultValue = "Mohd Ifteqar Ahmed") String name,
			@RequestParam("studentHobby") String hobby) {

		Student student = new Student();
		student.setStudentName(name);
		student.setStudentHobby(hobby);

		ModelAndView modelAndView = new ModelAndView("admissionSuccess");
		modelAndView.addObject("message", "Here are your details, Name: "
				+ name + " and your Hobby: " + hobby);
		modelAndView.addObject("student", student);
		
		return modelAndView;
	}

}
