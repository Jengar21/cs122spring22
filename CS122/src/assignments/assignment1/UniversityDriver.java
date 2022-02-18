package assignments.assignment1;

public class UniversityDriver {
	public static void main(String [] args) {
		Person person = new Person("Sarah", "Paulson", "2345643890",
				"Pauls12@gmail.com");
		Person student = new Student("Wendy", "Trade",
				"0983452789", "wtc@gmail.com", 3);
		Person employee = new Employee("Noah", "David",
				"7894533778", "Ndavid@gmail.com");
		Person faculty = new Faculty("Kim", "Kash",
				"1457892346", "Kimk@gmail.com");
		Person staff = new Staff("Ed", "Smith",
				"2346784567", "edsmith1@gmail.com");
		System.out.println(person.toString() + "\n");
		System.out.println(student.toString() + "\n");
		System.out.println(employee.toString() + "\n");
		System.out.println(faculty.toString() + "\n");
		System.out.println(staff.toString() + "\n");

	}

}
