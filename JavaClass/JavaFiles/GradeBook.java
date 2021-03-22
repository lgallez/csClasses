// Name: Layla Gallez
// Data: 7/5/2020
// Description: Using nested if statements
// File Name: GradeBook.java

import java.io.*;
import java.text.*;

class GradeBook
{
	public static void main(String[] args)
	throws IOException
	{
		double age;
		String s1;

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter your age: ");
		s1 = br.readLine();
		age = Double.parseDouble(s1);

		if (age < 18)
		{
			System.out.println("You're too young to vote");
		}

		if (age >= 18)
		{
			if (age < 21)
			{
				System.out.println("You must be between 18-21. " + 
								 "You can vote...");
				System.out.println("But can't legally buy alcohol. ");
			}
		}
		if (age >= 21)
		{
			System.out.println("But can legally buy alcohol. ");
		}

	}
}