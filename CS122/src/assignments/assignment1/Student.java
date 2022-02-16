package assignments.assignment1;

public class Student extends Person {
	private final String CLASS_STATUS;
	
	public Student(String name, String address, String phone, String email, String CLASS_STATUS)
	{
		super(name, address,phone,email);
		this.CLASS_STATUS= CLASS_STATUS;
		
	}

	public String getCLASS_STATUS() {
		return CLASS_STATUS;
	}
	
	

}
