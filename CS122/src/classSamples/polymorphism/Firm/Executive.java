package classSamples.polymorphism.Firm;//********************************************************************
//  Executive.java       Author: Lewis/Loftus
//
//  Represents an executive staff member, who can earn a bonus.
//********************************************************************

public class Executive extends Employee {
	private double bonus;
	private int exVacation = 0;

	// -----------------------------------------------------------------
	// Constructor: Sets up this executive with the specified
	// information.
	// -----------------------------------------------------------------
	
	public Executive(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double bonus, int exVacation) {
		super(eName, eAddress, ePhone, socSecNumber, rate);

		bonus = 0;
	}

	// -----------------------------------------------------------------
	// Awards the specified bonus to this executive.
	// -----------------------------------------------------------------
	public void awardBonus(double execBonus) {
		bonus = execBonus;
	}

	// -----------------------------------------------------------------
	// Computes and returns the pay for an executive, which is the
	// regular employee payment plus a one-time bonus.
	// -----------------------------------------------------------------
	public double pay() {
		double payment = super.pay() + bonus;

		bonus = 0;

		return payment;
	}
	
	public int vacation() {
		return STANDARD_VACATION + exVacation;
	}

}
