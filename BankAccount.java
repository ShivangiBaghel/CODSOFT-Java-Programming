package task3;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
	private double balance;
	private List<String> history;
	
	//Constructor
	public BankAccount(double initialBalance) {
		balance = initialBalance;
		history = new ArrayList<>();
		history.add("Account created with balance:" +balance);
	}
	
	//Deposit Method
	public void deposit(double amount) {
		if(amount > 0 ) {
			balance = balance + amount;
			history.add("Deposited: " + amount);
			System.out.println("Deposit Successfully!");
		}else {
			System.out.println("Invalid amount");	
		}
	}
	
	//Withdraw Method
	public void withdraw(double amount) {
		if(amount <= balance && amount > 0) {
			balance = balance - amount;
			history.add("Withdrawn: " + amount);
			System.out.println("Withdraw Successfully!");
		}else {
			System.out.println("Insufficient amount or Invalid amount");
		}
	}
	
	//Check Balance
	public double getBalance() {
		return balance;
	}
	
	//Showing History
	public void showHistory() {
		System.out.println("\n Transacton History: ");
		for(String record: history) {
			System.out.println(record);
		}
	}

}
