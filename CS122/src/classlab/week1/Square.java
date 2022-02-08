package classlab.week1;

public class Square extends Shape{

	public int side1;

	public Square(String name, int side1) {
		super(name);
		this.side1 = side1;

	}

	public int area( ) {
		return side1;
	}

	public String toString() {
		return name + " " + area();

	}
}