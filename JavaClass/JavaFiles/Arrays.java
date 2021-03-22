// Name: Layla Gallez
// Data: 7/16/2020
// Description: Doing Arrays
// File Name: Arrays.java

import java.util.Scanner;

class Arrays
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int fmax [] = new int[10];

		// enter values into an array
		for (int i = 0; i < fmax.length; i++)
		{
			System.out.println("Enter your integers " + (i + 1) + ':');
			fmax[i] = keyboard.nextInt();
		}

		int array [] = fmax;
		double count = 0;
		double sum = 0;
		double largest = Double.MAX_VALUE;

		System.out.print("ARRAY = {");
		int k;
		for (k = 0; k < array.length - 1; k++)
			{System.out.print(array[k] + ",");}
		System.out.println(array[k] + "}");

		for (int i = 0; i < array.length; i++)
		{
			sum = sum + array[i];
			if (array[i] == 1)
				count++;
			if (i == 0)
				largest = array[i];
			else 
			{
				if (array[i] > largest)
					largest = array[i];
			}
		}
		
		System.out.print("The MAX value is: " + largest + "\n"); 		
	}
}

/*
JavaFiles🌸javac Arrays.java
JavaFiles🌸java Arrays
Enter your integers 1:
6
Enter your integers 2:
5
Enter your integers 3:
7
Enter your integers 4:
5
Enter your integers 5:
7
Enter your integers 6:
5
Enter your integers 7:
7
Enter your integers 8:
5
Enter your integers 9:
7
Enter your integers 10:
56
ARRAY = {6,5,7,5,7,5,7,5,7,56}
The MAX value is: 56.0
JavaFiles🌸
*/