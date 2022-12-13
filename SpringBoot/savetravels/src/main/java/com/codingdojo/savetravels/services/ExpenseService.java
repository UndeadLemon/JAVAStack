package com.codingdojo.savetravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.savetravels.models.Expense;
import com.codingdojo.savetravels.repositories.ExpenseRepository;

@Service
public class ExpenseService {

		private final ExpenseRepository expenseRepo;
		
		public ExpenseService(ExpenseRepository expenseRepo) {
			this.expenseRepo=expenseRepo;
		}
		
		public Expense create(Expense expense) {
			return expenseRepo.save(expense);
		}
		
		public List<Expense> getAll(){
			return expenseRepo.findAll();
		}
		
		public Expense findOne(Long id) {
			Optional<Expense> optionalExpense = expenseRepo.findById(id);
			if(optionalExpense.isPresent()) {
				return optionalExpense.get();
			}else {
				return null;
			}
		}
		public Expense update(Long id, String name, String vendor, double cost) {
			Expense expenseToBeUpdated = new Expense(id, name, vendor, cost);
			return expenseRepo.save(expenseToBeUpdated);
		}
		public Expense update(Expense expense) {
			
			return expenseRepo.save(expense);
		}
		
		public String deleteById(Long id) {
			expenseRepo.deleteById(id);
			return "You deleted the record with an id of: " + id;
		}
}
