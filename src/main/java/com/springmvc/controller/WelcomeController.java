package com.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springmvc.models.Customer;
import com.springmvc.models.LoginRequest;

@Controller
public class WelcomeController {
	private static Logger logger = LoggerFactory
			.getLogger(WelcomeController.class);

	@RequestMapping("/")
	public String welcome(Model model) {
		logger.info("Login page is loaded");
		model.addAttribute("loginRequest", new LoginRequest());
		return "login";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String login(Model model,@ModelAttribute("loginRequest") LoginRequest loginRequest,HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession(false);
		if (request.isRequestedSessionIdValid() && session != null) {
			session.invalidate();
			}		
		logger.info("User is logged  in");
		return "welcome";
	}
	
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logout(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession(false);
		if (request.isRequestedSessionIdValid() && session != null) {
			session.invalidate();
			}
		logger.info("User is logged  out");
		return "logout";
	}
}