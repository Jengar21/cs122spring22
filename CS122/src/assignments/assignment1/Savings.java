package assignments.assignment1;

public class Savings extends Account {
	private double OVERDRAWN;
	
	public Savings() {
		
	}
	public Savings(int id, double balance){
		super(id,balance);
	}

	public Savings(double OVERDRAWN) {
		this.OVERDRAWN = OVERDRAWN ;

	}

}




