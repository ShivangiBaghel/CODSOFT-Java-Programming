package task3;

import java.util.Scanner;

public class ATM {
	private BankAccount account;
	private final int PIN =1999;
	
	public ATM(BankAccount account) {
		this.account = account;
	}
	
	//Pin authentication
	private boolean authenticate() {
		Scanner sc = new Scanner(System.in);
		int attempts = 3;
		
		while(attempts > 0) {
			System.out.println("Enter PIN: ");
			int enteredPin = sc.nextInt();
			
			if(enteredPin == PIN) {
				return true;
			}else {
				attempts--;
				System.out.println("Wrong Pin. Attempts left: " +attempts );
			}
		}
		return false;
	}
	
	//Start ATM 
	public void start() {
		if(!authenticate()) {
			System.out.println("Card blocked. Try again later.");
			return;
		}
		
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("\n ATM Menu");
			System.out.println("1. Check Balance ");
			System.out.println("2. Deposit ");
			System.out.println("3. Withdraw ");
			System.out.println("4. Transaction History");
			System.out.println("5. Exit ");
			
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			switch(choice) {
			  case 1:
				  checkBalance();
				  break;
				  
			  case 2:
				  System.out.println("Enter amount to deposit: ");
				  double depositAmount = sc.nextDouble();
				  account.deposit(depositAmount);
				  break;
				  
			  case 3:
			      System.out.println("Enter amount to withdraw: ");
			      double withdrawAmount = sc.nextDouble();
			      account.withdraw(withdrawAmount);
			      break;
			      
			  case 4: 
				  account.showHistory();
				  break;
			      
			  case 5:
				  System.out.println("Thanks for using ATM! ");
				  break;
				  
			  default : 
				  System.out.println("Invalid choice. Try Again. ");
			
			}
		}while(choice != 5);
		
		sc.close();
	}
	
	//Check Balance Method
	public void checkBalance() {
		System.out.println(" Current Balance: " + account.getBalance());
	}
}
