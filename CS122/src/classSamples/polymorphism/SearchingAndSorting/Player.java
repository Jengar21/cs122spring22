package classSamples.polymorphism.SearchingAndSorting;

public class Player {
	private final String name;
	private int XP;

	public Player(String name, int XP) {
		this.name = name;
		this.XP = XP;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		name = name;
	}

	public int getXP() {
		return XP;
	}

	public void setXP(int XP) {
		XP = XP;
	}

	public String toString()
	{
		return name + " " + XP + " " ;
	}
	
	public boolean equals(Object other) {
		return (name.equals(((Player) other).getName()) && XP.equals(((Player) other).getXP(int)));
	}
	
	public int compareTo() {
		
	}
	
}
