package assignments.assignment1;

public class Employee extends Person {
	private String office;
	private String salary;
	private Account DATE_HIRED;

	public Employee() {

	}

	public Employee(String name, String address, String phone, String email) {
		super(name, address, phone, email);

	}

	public Employee(String office, String salary, Account DATE_HIRED) {
		this.office = office;
		this.salary = salary;
		this.DATE_HIRED = DATE_HIRED;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public Account getDATE_HIRED() {
		return DATE_HIRED;
	}

	public void setName(Account DATE_HIRED) {
		this.DATE_HIRED = DATE_HIRED;
	}

}
