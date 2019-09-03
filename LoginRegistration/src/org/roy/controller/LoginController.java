package org.roy.controller;

import org.roy.model.Login;
import org.roy.model.User;
import org.roy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@Autowired
	private UserService userService;

	@RequestMapping("/login")
	public ModelAndView showLoginForm() {
		ModelAndView mv = new ModelAndView("login"); // loads the view page named 'login'
		mv.addObject("login", new Login()); // maps a Login object to the form using modelAttribute
		return mv; // returns the view page
	}

	@RequestMapping("processLogin")
	public ModelAndView processLogin(@ModelAttribute("login") Login loginUser) {
		User user = userService.login(loginUser);
		ModelAndView mv;
		if (user != null) {
			mv = new ModelAndView("dashboard");
			mv.addObject("user", user);
		} else {
			mv = new ModelAndView("login");
			mv.addObject("error", "Invalid Credentials for user: "+loginUser.getUserName());
		}
		return mv;
	}
}
