package classSamples.polymorphism.Firm;

class Judge implements Speaker{
	@Override
	public void speak() {
		System.out.println("Judge is speaking");

	}


	@Override
	public void announce(String str) {
		System.out.println("Judge annoncing " + str);

	}

}


