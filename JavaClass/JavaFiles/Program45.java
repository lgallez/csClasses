// Name: Layla Gallez
// Data: 7/2/2020
// Description: Interactive Dialog Input
// File Name: Program45.java


import javax.swing.JOptionPane;
public class Program45
{
	public static void main(String[] args)
	{
		String s1, s2, message;
		double num1, num2, average;
		try
		{
			s1 = JOptionPane.showInputDialog("Enter a number: ");
			num1 = Double.parseDouble(s1);

			s2 = JOptionPane.showInputDialog("Enter another amount: ");
			num2 = Double.parseDouble(s2);

			average = (num1 + num2) / 2;
			message = "The average of " + num1 + " and " + num2 + " is " + average;

			JOptionPane.showMessageDialog(null
											 , message
											 , "QuickTest Program 4.5"
											 , JOptionPane.INFORMATION_MESSAGE
											 );
		}

		catch (NumberFormatException n)
		{
			JOptionPane.showMessageDialog(null
											 , "You must enter a number"
											 , "Input data error"
											 , JOptionPane.ERROR_MESSAGE
											 );			
		}

		catch (NullPointerException n)
		{
			JOptionPane.showMessageDialog(null
											 , "You pressed the cancel button"
											 , "Program Termination"
											 , JOptionPane.ERROR_MESSAGE
											 );			
		}
	}
}