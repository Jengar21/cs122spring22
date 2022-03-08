package classSamples.polymorphism.Firm;

public class Driver {
	public static void main(String[] args) {
		// Create Judge object
		Judge judge = new Judge();
		// call judge method
		judge.speak();
		// call announce method
		judge.announce("How do you plead?");

		// Create Clerk object
		Clerk clerk = new Clerk();
		// call speak method
		clerk.speak();
		// call announce method
		clerk.announce("Defendant pleads not guilty");

		// Create Defendant object
		Defendant defendant = new Defendant();
		// call speak method
		defendant.speak();
		// call announce method
		defendant.announce("Not guilty");

	}

}
