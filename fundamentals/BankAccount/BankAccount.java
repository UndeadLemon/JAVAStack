package com.codingdojo.bankaccount;

public class BankAccount {
	private double checkingBalance;
	private double savingsBalance;
	private static int accounts = 0;
	private static double total = 0;
	public BankAccount(double checking, double savings) {
		this.checkingBalance = checking;
		this.savingsBalance = savings;
		accounts++;
		total += (checking + savings);
	}
	public static double getBankTotal() {
		return total;
	}
	public static int getAccountsTotal() {
		return accounts;
	}
	public void addTotal(double val) {
		total += val;
	}
	public double getChecking() {
		return this.checkingBalance;
	}
	public double getSavings() {
		return this.savingsBalance;
	}
	public void addBalance (String accountType, double amount) {
		if(accountType.equals("checking")){
			this.checkingBalance += amount;
		}
		if(accountType.equals("savings")) {
			this.savingsBalance += amount;
		}
		addTotal(amount);
	}
	public void withdrawBalance (String accountType, double amount) {
		if(accountType.equals("checking")) {
			if(!(amount > checkingBalance)) {
				System.out.println("Cannot withdraw, not enough funds!");
				return;
			}
			this.checkingBalance -= amount;
			
		}
		if(accountType.equals("savings")) {
			if(!(amount > savingsBalance)) {
				System.out.println("Cannot withdraw, not enough funds!");
				return;
			}
			this.savingsBalance -= amount;
			
		}
		addTotal(-amount);
	}
	public double getTotalAccount () {
		return this.checkingBalance + this.savingsBalance;
	}
}
