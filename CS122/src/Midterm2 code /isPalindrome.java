import java.util.Scanner;


class  NotPalindromeException extends Exception

{

	NotPalindromeException(String word)

	{

		super(word);

	}



	public static void main(String[]args)
	{
		//For capturing user input
		Scanner scanner = new Scanner(System.in);
		String str;

		try
		{
			System.out.println("Enter the String for check:");
			str = scanner.nextLine();

			if(pal(str,0,0))
				System.out.println(str + " is a palindrome");
			else
				throw new NotPalindromeException("NotPalindrome");


		}
		catch( NotPalindromeException e1)
		{
			System.out.println("Exception is "+e1);
		}

	}
	static boolean pal(String word, int s, int e) 
	{ 
		if (s == e)    // If there is only one character 
			return true;  
		// If first and last characters do not match 
		if ((word.charAt(s)) != (word.charAt(e))) 
			return false;   

		if (s < e + 1) 
			return pal(word, s + 1, e - 1);   
		return true; 
	}   
	static boolean isPalindrome(String word) 
	{ 
		int n = word.length();   

		if (n == 0) 
			return true;   
		return pal(word, 0, n - 1); 
	} 
}



