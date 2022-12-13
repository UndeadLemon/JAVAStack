package com.codingdojo.savetravels.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.savetravels.models.Expense;
import com.codingdojo.savetravels.services.ExpenseService;

@Controller
@RequestMapping("/expenses")
public class ExpenseController {
	
	public final ExpenseService expenseServ;
	public ExpenseController (ExpenseService expenseServ) {
		this.expenseServ = expenseServ;
	}
	
	@GetMapping("/all")
	public String allExpenses(Model model,  @ModelAttribute("expense") Expense expense) {
		Expense newExpense = new Expense();
		model.addAttribute("expense", newExpense);
		model.addAttribute("allExpenses", expenseServ.getAll());
		return "dashboard.jsp";
	}
	@PostMapping("/process")
	public String processExpenses(@Valid @ModelAttribute("expense") Expense expense, BindingResult result) {
		if(result.hasErrors()) {
			return "dashboard.jsp";
		} else {
			expenseServ.create(expense);
			return "redirect:/expenses/all";
		}
	}
	@GetMapping("/{id}/view")
	public String viewPage(@PathVariable("id") Long id, Model model) {
		Expense expense = expenseServ.findOne(id);
		model.addAttribute("expense", expense);
		return "viewone.jsp";
	}
	@GetMapping("/{id}/edit")
	public String editPage(@PathVariable("id") Long id, Model model) {
		Expense expense = expenseServ.findOne(id);
		model.addAttribute("expense", expense);
		return "edit.jsp";
	}
	
	@PutMapping(value="/{id}")
	public String updateExpense(@Valid @ModelAttribute("expense") Expense expense, BindingResult result) {
		if (result.hasErrors()) {
			return "edit.jsp";
		}
		else {
			expenseServ.update(expense);
			return "redirect:/expenses/all";
		}
	}
	@DeleteMapping("/{id}")
	public String destroy(@PathVariable("id") Long id) {
		expenseServ.deleteById(id);
		return "redirect:/expenses/all";
	}
}

