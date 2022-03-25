package classSamples.inheritance.Words;


public abstract class Mario {
	public int life;
	public Mario() {
		life = 5;
	}

	public abstract void printLife();

	public void decreacingLife() {
		life -= 1;
	}

}

