// Name: Layla Gallez
// Data: 7/3/2020
// Description: sqrtCalculator
// File Name: sqrtCalculator.java

import java.util.*;

public class sqrtCalculator
{
	public static void main(String[] args)
	{
		double num1;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to get it's square root: ");
		num1 = sc.nextDouble();
		System.out.println("The square root of " + num1 + " is: " + Math.sqrt(num1));
	}
}