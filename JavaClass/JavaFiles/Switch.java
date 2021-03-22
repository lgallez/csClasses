// Name: Layla Gallez
// Data: 7/5/2020
// Description: Using switch statements
// File Name: Switch.java

import java.io.*;

class Switch
{
	public static void main(String[] args)
	throws IOException
	{
		int code;
		String s1;

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter code (1,2,3,4,5,6): ");
		s1 = br.readLine();
		code = Integer.parseInt(s1);

		switch(code)
		{
			case 1:
				System.out.println("Freshman");
				break;
			case 2:
				System.out.println("Sophomore");
				break;
			case 3:
				System.out.println("Junior");
				break;
			case 4:
				System.out.println("Senior");
				break;
			case 5:
				System.out.println("Masters Program");
				break;
			case 6:
				System.out.println("Doctoral Program");
				break;
			default: 
				System.out.println("Not a valid code");
		}
	}
}

/*
JavaFiles🌸javac Switch.java
JavaFiles🌸java Switch
Enter code (1,2,3,4,5,6): 5
Masters Program
JavaFiles🌸
*/