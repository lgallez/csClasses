// Name: Layla Gallez
// Data: 7/2/2020
// Description: 
// File Name: noScreenShot.java

import java.util.*; // needed for access input stream classes

public class twentyOneQuestions
{
	public static void main(String[] args)
	{
		double bill
			,radius
		 	,celsius 
			,length
			,width
			,miles
			,gallons;

		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter the amount of the bill: ");
		bill = s1.nextDouble();
		System.out.println("Sales tax is 6%");
		System.out.println("Your Total is: " + bill * 1.06);

		Scanner s2 = new Scanner(System.in);
		System.out.print("Enter the radius of a circle: ");
		radius = s2.nextDouble();
		System.out.println("PI = 3.1416");
		System.out.println("The area of your circle is: " + radius * 3.1416);

		Scanner s3 = new Scanner(System.in);
		System.out.print("Enter the temperature in degrees Celsius: ");
		celsius = s3.nextDouble();
		System.out.println("The temperature is: " + (9.0/5.0)* celsius + 32.0 + " degrees Celsius");

		Scanner s4 = new Scanner(System.in);
		System.out.print("Enter the length of the office: ");
		length = s4.nextDouble();
		Scanner s5 = new Scanner(System.in);
		System.out.print("Enter the width of the office: ");
		width = s5.nextDouble();
		System.out.println("The area of your the office is: " + (width * length));

		Scanner s6 = new Scanner(System.in);
		System.out.print("Enter the miles driven: ");
		miles = s6.nextDouble();
		Scanner s7 = new Scanner(System.in);
		System.out.print("Enter the gallons of gas used: ");
		gallons = s7.nextDouble();
		System.out.println("Your MPG is: " + (miles / gallons));
	}

}

/*
JavaFiles🌸javac twentyOneQuestions.java
JavaFiles🌸java twentyOneQuestions
Enter the amount of the bill: 100
Sales tax is 6%
Your Total is: 106.0
Enter the radius of a circle: 100
PI = 3.1416
The area of your circle is: 314.15999999999997
Enter the temperature in degrees Celsius: 0
The temperature is: 0.032.0 degrees Celsius
Enter the length of the office: 10
Enter the width of the office: 10
The area of your the office is: 100.0
Enter the miles driven: 10
Enter the gallons of gas used: 20
Your MPG is: 0.5
JavaFiles🌸
*/