// Name: Layla Gallez
// Data: 7/12/2020
// Description: Doing GUI's
// File Name: ForLoop.java

import javax.swing.JOptionPane;
import java.util.Scanner;

public class ForLoop
{
	public static void main(String[] args)
	{
	
		for (int i = 0; i < 5; i ++)
		{
			System.out.println("i = " + i);
		}

		for (int index = 0; index <= 8; index += 2)
		{
			System.out.println("index = " + index);
		}

		for (int a = 4; a >= 0; a --)
		{
			System.out.println("a = " + a);
		}

		for (int b = 4; b >= 0; b-=2)
		{
			System.out.println("b = " + b);
		}

		Scanner sc = new Scanner(System.in);
		System.out.print("How many times to reper the loop: ");
		int stop = sc.nextInt();
		double num, smallest = Double.MAX_VALUE, sum = 0;

		for (int i = 0; i <= stop; i ++)
		{
			System.out.println("Enter number " + i + ":");
			num = sc.nextDouble();
			sum = sum + num;

			if (i == 1)
				smallest = num;

			else
			{
				if (num < smallest)
						smallest = num;
			}
		}
		System.out.println("sum=" + sum + ", avg=" + sum/stop + ", smallest=" + smallest);
	}
}