package classSamples.polymorphism.SearchingAndSorting;

public class Player implements Comparable<Player>{
	private final String name;
	private int XP;

	public Player(String name, int XP) {
		this.name = name;
		this.XP = XP;
	}

	public String getName() {
		return this.name;
	}
	
	public int getXP() {
		return XP;
	}

	public void setXP(int XP) {
		this.XP = XP;
	}

	public String toString()
	{
		return name + " " + XP + " " ;
	}
	
	public boolean equals(Object o) {
		return this.name.equals(((Player)o).getName());
	}
	
	public int compareTo(Player o) {
		return name.compareTo(o.getName());
		
	}
	
}
