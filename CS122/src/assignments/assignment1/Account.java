package assignments.assignment1;

public class Account {
	protected int id = 0;
	protected double balance = 0.0;
	private static double annualInterestRate = 0.0;

	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}

	public Account() {
		
	}

	public int getId() {
		return this.id;
	}

	public double getBalance() {
		return this.balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}


	public void setId(int id) {
		this.id = id;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		Account.annualInterestRate = annualInterestRate;
	}

	public double getMonthlyInterestRate() {
		return (annualInterestRate / 12) ;
	}

	public double setMonthlyInterest(double monthlyInterestRate) {
		return getMonthlyInterestRate();
	}

	public void withdraw(double amount) {
		this.balance -= amount;
		
		if(balance >= amount)
		{
			balance -= amount;
		}
		else 
			System.out.print("No sufficient balance");
	}

	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public String toString() {
		return "Account ID = "+ id +", balance = " + balance + ", annual interest rate = "+ annualInterestRate + ", monthly interest rate = "+ getMonthlyInterestRate() + " ";
	}

	

}
