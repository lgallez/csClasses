// Name: Layla Gallez
// Data: 6/29/2020
// Description: Create program with user input
// File Name: Program41.java

import java.io.*; //needed for InputStreamReader & BefferedReader
public class Program41
{
	public static void main(String[] args)
	throws IOException // need this for readLine()
	{
		String s1, s2;
		double num1, num2, product;

		// set up the basic input stream
		// needed for information to be entered into program using the keyboard
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr); // needed for readLine()

		// tell the user what to enter
		System.out.print("Enter a number: ");
		// prompt - message the tells the user what to enter

		// when it reaches br.readLine(), the program will pause. 
		// the user will type a number, press Enter, and then the program resumes. 
		s1 = br.readLine(); // INPUT: user enters a number which is read as a string
		num1 = Double.parseDouble(s1); // the string is converted into a double

		System.out.print("Enter another number: ");
		s2 = br.readLine(); // INPUT
		num2 = Double.parseDouble(s2);

		product = num1 * num2; // multiply the two numbers

		System.out.println(num1 + " times " + num2 + " = " + product);
	}
}


/*
JavaFiles🌸javac Program41.java
JavaFiles🌸java Program41
Enter a number: 5
Enter another number: 6
5.0 times 6.0 = 30.0
JavaFiles🌸
*/ 