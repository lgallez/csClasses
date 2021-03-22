// Name: Layla Gallez
// Data: 7/14/2020
// Description: String Buffer class
// File Name: StringBufferMethods.java

import java.io.*;
import java.util.StringTokenizer;

public class StringBufferMethods
{
	public static void main(String[] args)
	{
		StringBuffer str = new StringBuffer("This cannot be");
		int i, numChars;

		System.out.println("The original string is: " + str);
		numChars = str.length();
		System.out.println("This string has " + numChars + " characters");

		str.insert(4, " I know");
		System.out.println("The string after insertion is now: " + str);
		numChars = str.length();
		System.out.println("This string has " + numChars + " characters");

		str.replace(12, 18, "to");
		System.out.println("The string after replacement is now: " + str);
		numChars = str.length();
		System.out.println("This string has " + numChars + " characters");

		str.reverse();
		System.out.println("The string after being reversed is: " + str);

		StringTokenizer stb = new StringTokenizer("One two three four");
		System.out.println("First word is: " + stb.nextToken() );
		System.out.println("Second word is: " + stb.nextToken() );
		System.out.println("Third word is: " + stb.nextToken() );
		System.out.println("Fourth word is: " + stb.nextToken() );		
	}
}