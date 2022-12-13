package com.codingdojo.dojosandninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.codingdojo.dojosandninjas.models.Ninja;
import com.codingdojo.dojosandninjas.services.DojoService;
import com.codingdojo.dojosandninjas.services.NinjaService;

@Controller
@RequestMapping("/ninja")
public class NinjaController {
	public final DojoService dojoServ;
	public final NinjaService ninjaServ;
	public NinjaController (DojoService dojoServ, NinjaService ninjaServ) {
		this.dojoServ = dojoServ;
		this.ninjaServ = ninjaServ;
	}


	@GetMapping("/add")
	public String addNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		model.addAttribute("dojos", dojoServ.getAll());
		return "createninja.jsp";
	}
	@PostMapping("/processing")
	public String processingNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		if (result.hasErrors()) {
			return "createninja.jsp";
		}
		else {
			ninjaServ.create(ninja);
			return "redirect:/dojo/view/" + ninja.getDojo().getId();
		}
}

}
