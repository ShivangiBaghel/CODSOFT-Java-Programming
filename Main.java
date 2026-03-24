package task3;

public class Main {

	public static void main(String[] args) {
		//create bankAccount with initial balance
		BankAccount userAccount= new BankAccount(2000);
		
		//create atm and connect with account
		ATM atm = new ATM(userAccount);
		
		//start atm
		atm.start();

	}

}