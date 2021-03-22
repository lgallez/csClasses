// Name: Layla Gallez
// Data: 7/12/2020
// Description: Doing GUI's
// File Name: WhileGUI.java

import javax.swing.JOptionPane;
import java.util.Scanner;

class WhileGUI
{
	public static void main(String[] args)
	{
		String s1, s2, info, outMessage;
		int max = 4;
		int count;
		double num, num2, total, average;

		s2 = JOptionPane.showInputDialog("Enter the amout of numbers you want to average ");
			num2 = Double.parseDouble(s2);

		outMessage = "The average of the " + num2 + " numbers: \n";
		count = 1;
		total = 0;

		while (count <= num2)
		{
			s1 = JOptionPane.showInputDialog("Enter number " + count + ":");
			num = Double.parseDouble(s1);

			total = total + num;
			outMessage = outMessage + num + " ";
			count++;
		}

		average = total / num2;
		JOptionPane.showMessageDialog(null, outMessage + "\n is " + average,
			"QuickTest Program 6.7", JOptionPane.INFORMATION_MESSAGE);
	}
}
