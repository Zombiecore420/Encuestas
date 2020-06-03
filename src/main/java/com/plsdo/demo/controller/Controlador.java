package com.plsdo.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.plsdo.demo.interfaceService.IPersonaService;
import com.plsdo.demo.modelo.Persona;

@Controller
@RequestMapping
public class Controlador {

	@Autowired
	private IPersonaService service;
	
	@GetMapping("/listar")
	public String list(Model model)
	{
		List<Persona>personas=service.list();
		model.addAttribute("personas", personas);
		return "index";
	}
	
}
