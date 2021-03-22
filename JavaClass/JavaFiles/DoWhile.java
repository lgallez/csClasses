// Name: Layla Gallez
// Data: 7/12/2020
// Description: Do Do While statements 
// File Name: DoWhile.java

import java.util.Scanner;
import javax.swing.*;

public class DoWhile
{
	public static void main(String[] args)
	{
		String s1, s2, info, outMessage;
		int max = 4;
		int count;
		double num, num1, num2, total, average;

		s1 = JOptionPane.showInputDialog("Enter the number of grades you want to average ");
		num1 = Double.parseDouble(s1);

		outMessage = "The average of the " + num1 + " grades: \n";
		count = 1;
		total = 0;

		while (true)
		{
			if (num1 == 999)
			{
				break; // stop the loop
			}

			if (num1 <= 100 || num1 > 0)
			{
				while (count <= num1)
				{
					s1 = JOptionPane.showInputDialog("Enter number " + count + ":");
					num2 = Double.parseDouble(s1);

					total = total + num2;
					outMessage = outMessage + num2 + " ";
					count++;
				}
				average = total / num1;
				JOptionPane.showMessageDialog(null, outMessage + "\n is " + average,
				"QuickTest Program 6.7", JOptionPane.INFORMATION_MESSAGE);
				break;
			}


			System.out.println("You entered an incorrect character!");
		}

	}
}

/*
JavaFiles🌸javac DoWhile.java
JavaFiles🌸java DoWhile
JavaFiles🌸
*/
		