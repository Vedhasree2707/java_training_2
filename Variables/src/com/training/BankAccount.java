package com.training;

public class BankAccount {
	//Static Variable
	private static int count;
	// instance variable
	private String accountHolderName;
	private double balance;
	private int accountNumber;
	// static method
	public static int getCount() {
		return ++count;
		
	}
	// instance method
	public double getUpdatedBalance(double amount) { //parameter variable
		//local variable
		double updatedBalance;
		//local variable
		double currentBalance =0;
		//local variable should be initialised before using
		// System.out.println(updatedBalance);
		currentBalance= this.balance+amount; //IN OTHER WAY
	this.balance = currentBalance;          // this.balance = this.balance+amount;
		return currentBalance;              // return this.balance;   
	}
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getAccountHolderName() {
		return accountHolderName;
		
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
		
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public static void setCount(int count) {
		BankAccount.count = count;
	}
	public BankAccount(String accountHolderName, double balance) {
		super();
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.accountNumber = getCount();
		}
	
	

}
