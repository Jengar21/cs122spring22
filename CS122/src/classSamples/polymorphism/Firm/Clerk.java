package classSamples.polymorphism.Firm;

class Clerk implements Speaker{
	@Override
	public void speak() {
		System.out.println("\nClerk is speaking");

	}


	@Override
	public void announce(String str) {
		System.out.println("Clerk annoncing " + str);

	}

}
