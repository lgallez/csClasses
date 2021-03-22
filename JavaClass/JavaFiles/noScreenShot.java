// Name: Layla Gallez
// Data: 7/2/2020
// Description: 
// File Name: noScreenShot.java

import java.util.*; // needed for access input stream classes

public class twentyOneQuestions
{
	public static void main(String[] args)
	{
		double bill;
		double radius;
		double celsius; 

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
	}

}
