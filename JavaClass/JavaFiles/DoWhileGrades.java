import javax.swing.*;
import java.util.*;

class DoWhileGrades
{
	public static void main(String [] args)
	{
		double num1, total=0, count=0; // AS: total and count should start at known values, 0
		
		while (true) // neverending loop
		{
			Scanner s1 = new Scanner(System.in);
			System.out.print("Enter a grade: ");
			num1 = s1.nextDouble();

			if (num1 == 999) // AS: changed to if
			{
				break; // stop the loop
			}

			if (num1 < 0 || num1 > 100) // AS: changed to if
			{
				System.out.println("that's not a grade");
				continue; // makes the loop go all the way to the top
			}

			if (num1 > 0 || num1 < 100) // AS: changed to if
			{
				
				total = total + num1;
				System.out.println("The totalgrade is: " + total + " \n");// AS: moved after total = total + num1
				//count++; //AS: don't see a purpose for this
				continue; // makes the loop go all the way to the top
			}			
		}
	}
}