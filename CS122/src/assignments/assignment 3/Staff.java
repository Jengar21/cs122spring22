package assignments.extraquestions;


public class Staff {
	private final StaffMember[] staffList;

	// -----------------------------------------------------------------
	// Constructor: Sets up the list of staff members.
	// -----------------------------------------------------------------
	public Staff() {
		staffList = new StaffMember[8];

		staffList[0] = new Executive("Sam", "123 Main Line", "555-0469", "123-45-6789", 2423.07,0,0);

		staffList[1] = new Employee("Carla", "456 Off Line", "555-0101", "987-65-4321", 1246.15);
		staffList[2] = new Employee("Woody", "789 Off Rocker", "555-0000", "010-20-3040", 1169.23);

		staffList[3] = new Hourly("Diane", "678 Fifth Ave.", "555-0690", "958-47-3625", 10.55);

		staffList[4] = new Volunteer("Norm", "987 Suds Blvd.", "555-8374");
		staffList[5] = new Volunteer("Cliff", "321 Duds Lane", "555-7282");

		staffList[6] = new Commission("Nick", "1231 Sunset Ave", "555-1350", "567-09-3498", 12.89, 0.15);
	    staffList[7] = new Commission("Joe", "131 Bone Ave", "555-2758", "673-26-8647", 8.67, 0.15);

						((Executive) staffList[0]).awardBonus(500.00);

		((Hourly) staffList[3]).addHours(40);
		((Commission) staffList[6]).addHours(45);
		((Commission) staffList[6]).addSales(500);
		((Commission) staffList[7]).addHours(40);
		((Commission) staffList[7]).addSales(1000);
	}

	// -----------------------------------------------------------------
	// Pays all staff members.
	// -----------------------------------------------------------------
	public void payday() {
		double amount;
		int daysOff;

		for (int count = 0; count < staffList.length; count++) {
			System.out.println(staffList[count]);

			amount = staffList[count].pay(); // polymorphic
			daysOff= staffList[count].vacation();

			if (amount == 0.0)
				System.out.println("Thanks!");
			else
				System.out.println("Paid: " + amount);

			System.out.println("Vacation days: " + daysOff);

			System.out.println("-----------------------------------");
		}


	}

	public void sort() {
		sorting newSort = new sorting();
		newSort.selectionSort(staffList);
	}
}

