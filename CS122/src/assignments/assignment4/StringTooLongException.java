package assignments.assignment4;

import java.util.*;
import java.io.*;

class StringTooLongException extends Exception

{

	StringTooLongException(String str)

	{

		super(str);

	}

}

class StringDemo

{

	public static void main(String argsp[])

	{

		Scanner scan =new Scanner(System.in);

		String str;

		int len;

		try

		{

			while(true)

			{

				System.out.print("Enter a string please! ");

				str=scan.nextLine();

				len=str.length();

				if(str.equalsIgnoreCase("DONE"))

				{

					break;

				}

				if(len>20)

				{

					throw new StringTooLongException("String is too long");

				}

			}

		}

		catch(StringTooLongException e1)

		{

			System.out.println("Excepion is "+e1);

		}
		scan.close();
	}

}