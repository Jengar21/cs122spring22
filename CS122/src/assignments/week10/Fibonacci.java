package assignments.week10;

public class Fibonacci {

	//fib(0)=0;
	//fib(1)=1;
	//fib(index)= fib(index -1) + fib(index-2);

	public static int fib(int num) {
		int result;
		if(num==0 || num==1) {
			//System.out.print(num + "\t");
			return 1;
		}
		else {
			result= fib(num-1) + fib(num-2);
			//System.out.print(result +"\t");
			return result;

		}
	}
	public static main( String[] args) {
		for(int i =0; i<12; i++) {
			System.out.print(fib(i)+ "\t");
		}

		private static boolean isPalindrome(String s) {
			if(s.length()<=1)
				return true;
			else if (s.charAt(0) != s.charAt(s.length()-1))
				return false;
			else
				return isPalindrome(s.substring(1, s.length()-1));


		}

	}

}
