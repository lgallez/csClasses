// Name: Layla Gallez
// Data: 7/12/2020
// Description: Do Do While statements 
// File Name: DoWhile.java

import java.util.Scanner;

public class DoWhile
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		double grade, num1, count, total, num;
		String s1;
		
		do
		{
			System.out.println("Enter a grade: ");
			grade = sc.nextInt();
		
			if (grade < 0 || grade > 100)
			{
				System.out.println("That's not a grade");
			}

			if (num1 == 999)
			{
				break; // stop the loop
			}

			count = 1;
			total = 0;

			if (grade > 0 || grade <= 100)
// 			{
// 				System.out.println("continuing");
// 				continue; // makes the loop go all the way to the top
// 			}

			while (count <= grade)
			{
			s1 = System.out.println("Enter a grade: ");
			num = sc.nextInt();

			total = total + num;
			count++;

			System.out.println("Your total grade is " + total);
			}
		}

		while (grade < 0 || grade > 123);
	}
}


		

		


// if (num1 == 1)
// 			{
// 				break; // stop the loop
// 			}

// 			if (num1 == 2)
// 			{
// 				System.out.println("continuing");
// 				continue; // makes the loop go all the way to the top
// 			}

// 			System.out.println("hi");