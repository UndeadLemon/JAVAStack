package com.codingdojo.dojosandninjas.controllers;


import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.dojosandninjas.models.Dojo;
import com.codingdojo.dojosandninjas.services.DojoService;

@Controller
@RequestMapping("/dojo")
public class DojoController {
	
	public final DojoService dojoServ;
	
	public DojoController (DojoService dojoServ) {
		this.dojoServ = dojoServ;
	}

	@GetMapping("/view/{dojoId}")
	public String getDojo(@PathVariable("dojoId") Long id, Model model, Dojo dojo){
		dojo = dojoServ.findOne(id);
		model.addAttribute("dojo", dojo);
		return "listdojo.jsp";
	}
	@GetMapping("/create")
	public String createDojo(@ModelAttribute("dojo") Dojo dojo) {
		return "createdojo.jsp";
	}
	@PostMapping("/processing")
	public String processingDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if (result.hasErrors()) {
			return "createdojo.jsp";
		}
		else {
			dojoServ.create(dojo);
			return "redirect:/dojo/view/" + dojo.getId();
		}
	}
}
	
