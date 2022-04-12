package assignments.assignment4;

import java.util.*;
import java.io.*;

class StringTooLongException2 extends Exception

{

	StringTooLongException2(String str)

	{

		super(str);

	}

}

class StringDemo2

{

	public static void main(String args[])

	{

		Scanner scan =new Scanner(System.in);

		String str;

		int len;

		while(true)

		{

			try

			{

				System.out.print("Enter a string: ");

				str=scan.nextLine();

				len=str.length();

				if(str.equalsIgnoreCase("DONE"))

				{

					break;
				}

				if(len>20)

				{

					throw new StringTooLongException("String is way too long!!!!");

				}
			}

			catch(StringTooLongException e1)

			{

				System.out.println("Exception is "+e1);

			}

		}
		scan.close();
	}
}


