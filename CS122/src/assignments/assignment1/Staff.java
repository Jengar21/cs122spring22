package assignments.assignment1;

public class Staff extends Employee {
	private String title;

	public Staff() {

	}

	public Staff(String office, String salary, Account DATE_HIRED) {
		super(office,salary,DATE_HIRED);
	}

	public Staff(String name, String address, String phone, String email) {
		super(name, address, phone, email);
	}
	
	public Staff(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}



}
