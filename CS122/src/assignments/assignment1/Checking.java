package assignments.assignment1;

public class Checking extends Account {
	public final double OVERDRAFTLIMIT = 1000.00;

	public Checking() {
		
	}
	
	public Checking(double OVERDRAFTLIMIT) {
		this.OVERDRAFTLIMIT = OVERDRAFTLIMIT;

	}

	public Checking(int id, double balance) {
		super(id, balance);


	}
}
