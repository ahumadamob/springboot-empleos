package com.ahumadamob.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String showHome(Model model) {
		model.addAttribute("message", "Bienvenidos a Empleos App");
		model.addAttribute("fecha", new Date());
		return "home";
	}

}
