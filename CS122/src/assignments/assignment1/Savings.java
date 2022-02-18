package assignments.assignment1;

public class Savings extends Account {
	
	
	public Savings(int id, double balance) {
		super(id, balance);
	}
	
	public void withdraw(double amount) {
		if (amount < getBalance()) 
		{
			setBalance(getBalance() - amount);
		}
		
		else
			System.out.println( "Error!");
	}
	

}




