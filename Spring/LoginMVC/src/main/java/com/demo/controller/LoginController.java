package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.services.LoginService;

@Controller
public class LoginController {
	@Autowired
	private LoginService loginservice;

	@GetMapping("/login")
	public String showLoginPage() {
		return "login";
	}

	@GetMapping("/login")
	public String processLogin(@RequestParam String username, @RequestParam String password, Model model) {
		if (loginservice.login(username, password)) {
			model.addAttribute("msg", "Login Successful...");
			return "home";
		} else {
			model.addAttribute("msg", "Invalid Credentials!!!");
			return "login";
		}
	}
}
