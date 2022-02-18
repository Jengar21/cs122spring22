package assignments.assignment1;

public class Checking extends Account {
	private double overDraftLimit;


	public Checking(int id, double balance, double overdraftLimit) {
		super(id, balance);
		this.overDraftLimit = overDraftLimit;
	}

	public double getOverdraftLimit() {
		return overDraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overDraftLimit = overdraftLimit;
	}

	public void withdraw(double amount) {
		if (getBalance() - amount > overDraftLimit) {
			setBalance(getBalance() - amount);
		}
		else
			System.out.println("Error!");
	}


	public String toString() {
		return super.toString() + "over draft limit " + overDraftLimit;
	}
}