import javax.swing.*;
class BreakContinue
{
	public static void main(String [] args)
	{
		/*
		while (true) // neverending loop
		{
			String s1   = JOptionPane.showInputDialog("Enter 1 to stop 2 to continue:");
			double num1 = Double.parseDouble(s1);

			if (num1 == 1)
			{
				break; // stop the loop
			}

			if (num1 == 2)
			{
				System.out.println("continuing");
				continue; // makes the loop go all the way to the top
			}

			System.out.println("hi");
		}
		*/
		double age = 18;
		/*
		while (age < 10)
		{
			String s1   = JOptionPane.showInputDialog("Enter age < 10 to continue");
			age = Double.parseDouble(s1);
		}
		*/

		do
		{
			String s1   = JOptionPane.showInputDialog("Enter age < 10 to continue");
			age = Double.parseDouble(s1);
		}while (age < 10);

	}
}