package com.codingdojo.bookclub.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.bookclub.services.UserService;

@Controller
public class HomeController {
    
	private final UserService userServ;
	
    public HomeController(UserService userServ) {
    	this.userServ = userServ;
    }
    
    @GetMapping("/dashboard")
    public String dashboard(HttpSession session, Model model) {
    	if(session.getAttribute("user_id") == null) {
    		return "redirect:/users/";
    	}
    	model.addAttribute("loggedInUser", userServ.getUser((Long) session.getAttribute("user_id")));
    	return "dashboard.jsp";
    }
    @PostMapping("/dashboard/logout")
    public String logout(HttpSession session) {
    	session.invalidate();
    	return "redirect:/users/";
    }
    
}