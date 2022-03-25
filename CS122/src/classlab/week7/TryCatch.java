package classlab.week7;

public class TryCatch {
	public static void main(String[] args) {
		int [] num = new int[10];
		try {
			System.out.println("Line before errorous line in try");
			System.out.println(num[11]);
			System.out.println(10/num[9]);
			System.out.println("Line after errorous line in try");
		}

		catch (ArithmeticException e) {
			System.out.println("error occured");
			System.out.println(e.getMessage());

		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("another error occured");
			System.out.println(e.getMessage());	
		}
		//Generalized catches all exceptions
		catch (Exception e) {
			System.out.println("Unkown/unhandled exception");
			System.out.println(e.getMessage());	
		}
		finally {
			System.out.println("always ececuted");
		}
		System.out.println("Line outside try-catch");

	}

}
