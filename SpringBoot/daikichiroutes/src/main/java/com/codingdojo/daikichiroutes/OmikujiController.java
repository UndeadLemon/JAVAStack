package com.codingdojo.daikichiroutes;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping("/omikuji")
public class OmikujiController {
	
	@GetMapping("/")
	public String index() {
		
		
		return "omikuji.jsp";
	}
	@PostMapping("/omikuji_processing")
	public String redirectShow(HttpSession session, 
		@RequestParam(value="number") int number,
		@RequestParam(value="city") String city,
		@RequestParam(value="person") String person,
		@RequestParam(value="hobby") String hobby,
		@RequestParam(value="animal") String animal,
		@RequestParam(value="compliment") String compliment) {
		
		session.setAttribute("number", number);
		session.setAttribute("city", city);
		session.setAttribute("person", person);
		session.setAttribute("hobby", hobby);
		session.setAttribute("animal", animal);
		session.setAttribute("compliment", compliment);
		
		
		return "redirect:./show";
	}
	@GetMapping("/show")
	public String showPage(HttpSession session, Model model) {
		int number = (int) session.getAttribute("number");
		model.addAttribute("number", number);
		String city = (String) session.getAttribute("city");
		model.addAttribute("city", city);
		String person = (String) session.getAttribute("person");
		model.addAttribute("person", person);
		String hobby = (String) session.getAttribute("hobby");
		model.addAttribute("hobby", hobby);
		String animal = (String) session.getAttribute("animal");
		model.addAttribute("animal", animal);
		String compliment = (String) session.getAttribute("compliment");
		model.addAttribute("compliment", compliment);
		
		
		return "show.jsp";
	}
	

}
