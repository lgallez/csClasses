// Name: Layla Gallez
// Data: 7/2/2020
// Description: Added user input to decimal rounder machine
// File Name: NumberFormat.java

import java.util.*;

class NumberFormat
{
	public static void main(String[] args)
	{
		double num;
		double x1;
		double x2;
		double y1;
		double y2;

		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter a number: ");
		num = s1.nextDouble();
		System.out.printf("Rounded to 1 decimal num = %.1f\n", num);
		System.out.printf("Rounded to 2 decimal num = %.2f\n", num);
		System.out.printf("Rounded to 3 decimal num = %.3f\n", num);
		System.out.printf("Rounded to 4 decimal num = %.4f\n", num);

		Scanner s2 = new Scanner(System.in);
		System.out.print("Enter the first X coordinate: ");
		x1 = s2.nextDouble();
		Scanner s3 = new Scanner(System.in);
		System.out.print("Enter the first Y coordinate: ");
		y1 = s3.nextDouble();
		Scanner s4 = new Scanner(System.in);
		System.out.print("Enter the second X coordinate: ");
		x2 = s4.nextDouble();
		Scanner s5 = new Scanner(System.in);
		System.out.print("Enter the second Y coordinate: ");
		y2 = s5.nextDouble();


		System.out.println("The x coordinate of the midpoint is: " +  (x1+x2)/2 );
		System.out.println("The y coordinate of the midpoint is: " +  (y1+y2)/2 );
	}
}

/*
JavaFiles🌸javac NumberFormat.java
JavaFiles🌸java NumberFormat
Enter a number: 5.541254
Rounded to 1 decimal num = 5.5
Rounded to 2 decimal num = 5.54
Rounded to 3 decimal num = 5.541
Rounded to 4 decimal num = 5.5413
Enter the first X coordinate: 5
Enter the first Y coordinate: 6
Enter the second X coordinate: 1
Enter the second Y coordinate: 3
The x coordinate of the midpoint is: 3.0
The y coordinate of the midpoint is: 4.5
JavaFiles🌸
*/