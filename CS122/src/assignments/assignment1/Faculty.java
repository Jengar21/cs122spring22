package assignments.assignment1;

public class Faculty extends Employee{

	private String office_hours;
	private String rank;

	public Faculty() {

	}

	public Faculty(String office_hours, String rank) {
		this.office_hours = office_hours;
		this.rank = rank;
	}
	
	public Faculty(String office, String salary, Account DATE_HIRED) {
		super(office,salary,DATE_HIRED);
	}
	
	public Faculty(String name, String address, String phone, String email) {
	       super(name, address, phone, email);
	   }

	public String getOffice_hours() {
		return office_hours;
	}

	public void setOffice_hours(String office_hours) {
		this.office_hours = office_hours;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

}
