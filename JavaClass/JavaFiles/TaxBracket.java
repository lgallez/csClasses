// Name: Layla Gallez
// Data: 7/5/2020
// Description: Using nested if statements
// File Name: TaxBracket.java

import java.io.*;
import java.text.*;

class TaxBracket
{
	public static void main(String[] args)
	throws IOException
	{
		double income;
		double marital;
		String s2;
		String s1;

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter your income: ");
		s1 = br.readLine();
		income = Double.parseDouble(s1);

		System.out.print("Enter your marital status (1 = s / 2 = m): ");
		s2 = br.readLine();
		marital = Double.parseDouble(s2);

		if (income > 418400)
		{
			System.out.println("Net income: " + (income * .604));
			if (marital == 1)
			{
				System.out.println("Your net income hasn't changed because you're not married");
			}
			else if (marital == 2) {
				System.out.println("Your net income hasn't changed because we don't want to take the time to recalculate it.");
			}
			else
				System.out.println("Your net income hasn't changed because you entered an invalid character.");	
		}

		else if (income > 416700)
		{
			System.out.println("Net income: " + (income * .65));
			if (marital == 1)
			{
				System.out.println("Your net income hasn't changed because you're not married");
			}
			else if (marital == 2) {
				System.out.println("Your net income hasn't changed because we don't want to take the time to recalculate it.");
			}
			else
				System.out.println("Your net income hasn't changed because you entered an invalid character.");	
		}

		else if (income > 191650)
		{
			System.out.println("Net income: " + (income * .67));
			if (marital == 1)
			{
				System.out.println("Your net income hasn't changed because you're not married");
			}
			else if (marital == 2) {
				System.out.println("Your net income hasn't changed because we don't want to take the time to recalculate it.");
			}
			else
				System.out.println("Your net income hasn't changed because you entered an invalid character.");	
		}

		else if (income > 91900)
		{
			System.out.println("Net income: " + (income * .72));
			if (marital == 1)
			{
				System.out.println("Your net income hasn't changed because you're not married");
			}
			else if (marital == 2) {
				System.out.println("Your net income hasn't changed because we don't want to take the time to recalculate it.");
			}
			else
				System.out.println("Your net income hasn't changed because you entered an invalid character.");	
		}

		else if (income > 37950)
		{
			System.out.println("Net income: " + (income * .75));
			if (marital == 1)
			{
				System.out.println("Your net income hasn't changed because you're not married");
			}
			else if (marital == 2) {
				System.out.println("Your net income hasn't changed because we don't want to take the time to recalculate it.");
			}
			else
				System.out.println("Your net income hasn't changed because you entered an invalid character.");	
		}

		else if (income > 9325)
		{
			System.out.println("Net income: " + (income * .85));
			if (marital == 1)
			{
				System.out.println("Your net income hasn't changed because you're not married");
			}
			else if (marital == 2) {
				System.out.println("Your net income hasn't changed because we don't want to take the time to recalculate it.");
			}
			else
				System.out.println("Your net income hasn't changed because you entered an invalid character.");	
		}

		else if (income > 0)
		{
			System.out.println("Net income: " + (income * .90));
			if (marital == 1)
			{
				System.out.println("Your net income hasn't changed because you're not married");
			}
			else if (marital == 2) {
				System.out.println("Your net income hasn't changed because we don't want to take the time to recalculate it.");
			}
			else
				System.out.println("Your net income hasn't changed because you entered an invalid character.");	
		}

		else 
		{
			System.out.println("Net income: $0");
			if (marital == 1)
			{
				System.out.println("Your net income hasn't changed because you're not married");
			}
			else if (marital == 2) {
				System.out.println("Your net income hasn't changed because we don't want to take the time to recalculate it.");
			}
			else
				System.out.println("Your net income hasn't changed because you entered an invalid character.");	
		}		

	}
}

/*
JavaFiles🌸javac TaxBracket.java
JavaFiles🌸java TaxBracket
Enter your income: 0
Enter your marital status (1 = s / 2 = m): 2
Net income: $0
Your net income hasn't changed because we don't want to take the time to recalculate it.
JavaFiles🌸java TaxBracket
Enter your income: 6
Enter your marital status (1 = s / 2 = m): 1
Net income: 5.4
Your net income hasn't changed because you're not married
JavaFiles🌸java TaxBracket
Enter your income: 10000
Enter your marital status (1 = s / 2 = m): 5
Net income: 8500.0
Your net income hasn't changed because you entered an invalid character.
JavaFiles🌸java TaxBracket
Enter your income: 50000   
Enter your marital status (1 = s / 2 = m): 2
Net income: 37500.0
Your net income hasn't changed because we don't want to take the time to recalculate it.
JavaFiles🌸java TaxBracket
Enter your income: 120000
Enter your marital status (1 = s / 2 = m): 2
Net income: 86400.0
Your net income hasn't changed because we don't want to take the time to recalculate it.
JavaFiles🌸java TaxBracket
Enter your income: 200000
Enter your marital status (1 = s / 2 = m): 1
Net income: 134000.0
Your net income hasn't changed because you're not married
JavaFiles🌸java TaxBracket
Enter your income: 417000
Enter your marital status (1 = s / 2 = m): 564
Net income: 271050.0
Your net income hasn't changed because you entered an invalid character.
JavaFiles🌸java TaxBracket
Enter your income: 9000000
Enter your marital status (1 = s / 2 = m): 2
Net income: 5436000.0
Your net income hasn't changed because we don't want to take the time to recalculate it.
JavaFiles🌸

*/
