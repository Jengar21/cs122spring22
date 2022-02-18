package assignments.assignment1;

public class Student extends Person {

	private String CLASS_STATUS = " ";
	final int freshman =1;
	final int sophomore =2;
	final int junior=3;
	final int senior=4;


	public Student(String name, String address, String phone, String email, int STATUS)
	{
		super(name, address,phone,email);

		if(STATUS == 1)
		{
			setCLASS_STATUS("Freashman");
		}
		if(STATUS ==2)
		{
			setCLASS_STATUS("Sophomore");
		}
		if(STATUS ==3)
		{
			setCLASS_STATUS("Junior");
		}
		if(STATUS ==4)
		{
			setCLASS_STATUS("Senior");
		}

		setCLASS_STATUS("Student");
	}


	public String getCLASS_STATUS() {
		return CLASS_STATUS;
	}


	public void setCLASS_STATUS(String cLASS_STATUS) {
		CLASS_STATUS = cLASS_STATUS;
	}

	public String toString() {
		return super.toString() + " " + CLASS_STATUS;
	}
}




