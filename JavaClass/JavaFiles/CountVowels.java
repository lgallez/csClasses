// Name: Layla Gallez
// Data: 7/14/2020
// Description: Strings and Characters
// File Name: CountVowels.java

import java.io.*;
import java.text.*;

class CountVowels
{
	public static void main(String[] args)

	throws java.io.IOException
	{
		String str;

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter your string: ");
		str = br.readLine();

		int numChars = str.length()
					 , vowelCount = 0
					 , indivCount_a = 0
					 , indivCount_e = 0
					 , indivCount_i = 0
					 , indivCount_o = 0
					 , indivCount_u = 0;

		

		System.out.println("The string: " + str);

		
		for (int i = 0; i< numChars; i ++)
		{
			
			switch(str.charAt(i))
			{
				case 'a':
					indivCount_a++;
			}
			
			switch(str.charAt(i))
			{
				case 'e':
					indivCount_e++;
			}

			switch(str.charAt(i))
			{
				case 'i':
					indivCount_i++;
			}
			
			switch(str.charAt(i))
			{
				case 'o':
					indivCount_o++;
			}

			switch(str.charAt(i))
			{
				case 'u':
					indivCount_u++;				
			}

			vowelCount = indivCount_a
					   + indivCount_e
					   + indivCount_i
					   + indivCount_o
					   + indivCount_u;

		}
		System.out.println("has " + vowelCount + " vowels with: \n"
								  + indivCount_a + " a's \n"
								  + indivCount_e + " e's \n"
								  + indivCount_i + " i's \n"
								  + indivCount_o + " o's \n"
								  + indivCount_u + " u's \n");
	}
}

/*
JavaFiles🌸javac CountVowels.java
JavaFiles🌸java CountVowels
Enter your string: i feel like this took my longer than it should have
The string: i feel like this took my longer than it should have
has 16 vowels with: 
2 a's 
5 e's 
4 i's 
4 o's 
1 u's 

JavaFiles🌸
*/