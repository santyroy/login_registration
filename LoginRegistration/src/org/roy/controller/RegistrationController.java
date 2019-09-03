package org.roy.controller;

import org.roy.model.User;
import org.roy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistrationController {

	@Autowired
	private UserService userService;

	@RequestMapping("/register")
	public ModelAndView showRegistrationForm() {
		ModelAndView model = new ModelAndView("register"); // loads the view page named 'register'
		model.addObject("user", new User()); // maps a User object with the form via modelAttribute
		return model; // returns the view page
	}

	@RequestMapping("/processRegistration")
	public ModelAndView processRegistration(@ModelAttribute("user") User user) {
		userService.register(user);
		ModelAndView mv = new ModelAndView("registrationSuccess", "firstName", user.getFirstName());
		return mv;
	}
}
