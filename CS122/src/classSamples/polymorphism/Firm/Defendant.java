package classSamples.polymorphism.Firm;

class Defendant implements Speaker{
	@Override
	public void speak() {
		System.out.println("\nDefendant is speaking");

	}


	@Override
	public void announce(String str) {
		System.out.println("Defendant annoncing " + str);

	}


}
