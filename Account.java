package Task2;

public class Account {
	private double accBalance;
	
	//with no arguments
	public Account() {
		this.accBalance = 0.0;
	}
	
	//with arguments Constructor with an initial balance
	public Account (double initialBal) {
		this.accBalance = initialBal;
	}
	
	//Deposit Method
	public void deposit(double amount) {
		if (amount > 0) {
			this.accBalance += amount;
			System.out.println("Deposited amount : " + amount);
			System.out.println("Balance after deposited amount : " + this.accBalance);
		}
		else {
			System.out.println("Please make sure the amount is in positive value");
		}
		
	}
	
	//Withdraw Method
	public void withdraw (double amount) {
		if (amount > 0) {
			if (amount <= this.accBalance){
				this.accBalance -= amount;
				System.out.println(" Withdrawn amount : " + amount);
				System.out.println("Balance after withdrawn amount : " + this.accBalance);
			}
			else {
				System.out.println("Please make sure you have sufficient balance to withdraw");
			}
			}
		else {
			System.out.println("Please make sure the amount is in positive value");
		}
	}
	
	//to display balance
	public void displayBalance() {
	System.out.println("Current Balance is : " + this.accBalance);
	}

}
