package com.codingdojo.bankaccount;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount myAccount = new BankAccount(10, 20);
		System.out.println(myAccount.getTotalAccount());
		System.out.println(myAccount.getChecking());
		System.out.println(BankAccount.getAccountsTotal());
		System.out.println(BankAccount.getBankTotal());
		
		System.out.println("-----Second Account Test-----");
		BankAccount secondAccount = new BankAccount(1000, 500);
		System.out.println(BankAccount.getAccountsTotal());
		System.out.println(BankAccount.getBankTotal());
		
	}

}
