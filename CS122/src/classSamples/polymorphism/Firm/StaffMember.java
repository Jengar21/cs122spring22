package classSamples.polymorphism.Firm;//********************************************************************
//  StaffMember.java       Author: Lewis/Loftus
//
//  Represents a generic staff member.
//********************************************************************

abstract public class StaffMember implements payable, Comparable<StaffMember> {
	protected String name;
	protected String address;
	protected String phone;
	

	// -----------------------------------------------------------------
	// Constructor: Sets up this staff member using the specified
	// information.
	// -----------------------------------------------------------------
	public StaffMember(String eName, String eAddress, String ePhone) {
		name = eName;
		address = eAddress;
		phone = ePhone;
	}

	// -----------------------------------------------------------------
	// Returns a string including the basic employee information.
	// -----------------------------------------------------------------
	public String toString() {
		String result = "Name: " + name + "\n";

		result += "Address: " + address + "\n";
		result += "Phone: " + phone + "\n";
		

		return result;
	}
	
	public String getName() {
		return name;
	}

	
	// -----------------------------------------------------------------
	// Derived classes must define the pay method for each type of
	// employee.
	// -----------------------------------------------------------------
	public int compareTo(StaffMember o)
	{
		return name.compareTo(o.getName());
	}
	
	public abstract int vacation ();

	
}
