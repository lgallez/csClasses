// Name: Layla Gallez
// Data: 7/5/2020
// Description: Using if and switch statements
// File Name: Selection.java

import java.io.*;
import java.text.*;

class Selection
{
	public static void main(String[] args)
	throws IOException
	{
		double hours;
		String s1;

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Hours worked: ");
		s1 = br.readLine();
		hours = Double.parseDouble(s1);

		if (hours <= 40)
		{
			System.out.println("Gross pay: " + (hours * 8));
		}
		else if (hours > 40)
			System.out.println("Gross pay: " + ((hours - 40)*12 + 320));
		else 
			System.out.println("You made $0");
	}
}

/*
JavaFiles🌸javac Selection.java
JavaFiles🌸java Selection
Hours worked: 0
Gross pay: 0.0
JavaFiles🌸java Selection
Hours worked: 46
Gross pay: 392.0
JavaFiles🌸java Selection
Hours worked: 39
Gross pay: 312.0
JavaFiles🌸
*/
