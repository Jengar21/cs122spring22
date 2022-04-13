package assignments.assignment4;

import java.util.*;
import java.io.*;

class InvalidDocumentCodeException extends Exception
{

	InvalidDocumentCodeException(String test)

	{

		super(test);

	}

}

 class Driver

{

	public static void main(String args[])

	{

		Scanner scan =new Scanner(System.in);

		String test = " ";

		

		while(true)

		{

			try

			{

				System.out.print("Enter a name file: ");

				test=scan.nextLine();
				
				if(test.equalsIgnoreCase("DONE"))

				{

					break;
				}



				else if (test.charAt(0) == 'U' || test.charAt(0) == 'C' || test.charAt(0) == 'P') 
				{
					System.out.println("Valid Document");
					continue;
				}
				else
					throw new InvalidDocumentCodeException("Invalid Document Code");
					

	
				
			}

			catch(InvalidDocumentCodeException e1)

			{

				System.out.println("Exception is "+e1);

			}

		}
		scan.close();
	}
}




