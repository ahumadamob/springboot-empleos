package com.ahumadamob.controller;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ahumadamob.model.Job;

@Controller
public class HomeController {
	
	@GetMapping("/details")
	public String showDetails(Model model) {
		
		Job job = new Job();
		
		job.setTitle("Desarrollador SpringBoot Sr");
		job.setDescription("Se solicita desarrollador SpringBoot Sr con manejo avanzado de inglés para trabajar en remoto");
		job.setSalary(2800.0);
		job.setPostDate(new Date());
		job.setActive(true);
		
		model.addAttribute("job", job);		
		
		return "details";
	}
	
	@GetMapping("/list")
	public String showList(Model model) {
		List<String> list = new LinkedList<String>();
		
		list.add("Ingeniero en sistemas");
		list.add("Auxiliar contable");
		list.add("Arquitecto");
		list.add("Productor de seguros");
		
		model.addAttribute("list", list);
		
		return "list";
	}
	
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
