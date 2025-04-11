package Task2;

public class AccountMain {

	public static void main(String[] args) {

		Account accOne = new Account (500.00);
		accOne.displayBalance();
		
		//Deposit		
		accOne.deposit(250.00);
		
		//Withdrawal
		accOne.withdraw(150);
		
		//display balance
		accOne.displayBalance();
		
		Account accTwo = new Account (0);
		accTwo.displayBalance();		

		//Deposit		
		accTwo.deposit(50.00);
		
		//Deposit with negative value	
		accTwo.deposit(-100.00);
		
		//Withdrawal
		accTwo.withdraw(-10);	
		
		//Withdrawal more than balance
		accTwo.withdraw(100);
		
		//display balance
		accTwo.displayBalance();		

	}

}
