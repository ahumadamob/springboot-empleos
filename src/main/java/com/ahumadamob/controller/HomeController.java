package com.ahumadamob.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String showHome(Model model) {
		/*
		model.addAttribute("message", "Bienvenidos a Empleos App");
		model.addAttribute("fecha", new Date());
		*/
		
		String name = "Auxiliar de contabildad";
		Date pubDate = new Date();
		double salary = 600.0;
		boolean active = true;	
		
		model.addAttribute("name", name);
		model.addAttribute("pubDate", pubDate);
		model.addAttribute("salary", salary);
		model.addAttribute("active", active);
		
		return "home";
	}

}
