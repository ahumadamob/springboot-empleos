package com.ahumadamob.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ahumadamob.model.Job;

@Controller
public class HomeController {
	
	@GetMapping("/grid")
	public String showGrid(Model model) {
		model.addAttribute("jobs", getJobs());
		return "grid";
	}
	
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
	
	private List<Job> getJobs(){
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		List<Job> jobs = new LinkedList<Job>();
		
		try {
			// Oferta de Trabajo 1
			Job job1 = new Job();
			job1.setId(1);
			job1.setTitle("Ingeniero Civil");
			job1.setDescription("Se solicita Ingeniero Civil para desarrollar puente peatonal");
			job1.setSalary(27000.0);
			job1.setPostDate(sdf.parse("01-01-2023"));
			job1.setActive(true);
			
			// Oferta de Trabajo 2
			Job job2 = new Job();
			job2.setId(3);
			job2.setTitle("Productor de Seguros");
			job2.setDescription("Se busca Productor de Seguros para importante firma multinacional");
			job2.setSalary(1500.0);
			job2.setPostDate(sdf.parse("05-01-2023"));
			job2.setActive(true);	

			// Oferta de Trabajo 3
			Job job3 = new Job();
			job3.setId(3);
			job3.setTitle("Desarrollador Web");
			job3.setDescription("Buscamos en toda la Argentina un desarrollador Web para trabajar remoto");
			job3.setSalary(1800.0);
			job3.setPostDate(sdf.parse("10-01-2023"));
			job3.setActive(false);	
			
			// Oferta de Trabajo 4
			Job job4 = new Job();
			job4.setId(4);
			job4.setTitle("Auxiliar Contable");
			job4.setDescription("Banco Nación busca auxiliares contables para sucursales de Mendoza");
			job4.setSalary(900.0);
			job4.setPostDate(sdf.parse("15-01-2023"));
			job4.setActive(true);
			
			jobs.add(job1);
			jobs.add(job2);
			jobs.add(job3);
			jobs.add(job4);
			
			
			
		}catch(ParseException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		return jobs;		
	}

}
