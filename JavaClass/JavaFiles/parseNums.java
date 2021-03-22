// Name: Layla Gallez
// Data: 7/2/2020
// Description: Input and Formatting Class Methods
// File Name: parseNums.java

public class parseNums
{
	public static void main(String[] args)

		throws java.io.IOException // needed for readLine()
		{
			String s1;
			String s2;
			double num1;
			double num2;

			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);

			System.out.print("Enter a sentence: ");
			s1 = br.readLine();

			System.out.println("the sentence you entered is: " + s1);
			s1 = br.readLine();

			System.out.print("Now enter a number: ");
			s1 = br.readLine();

			System.out.print("Enter the circles radius: ");
			s1 = br.readLine();

			System.out.println("the radius you entered is: " + s1);
			s1 = br.readLine();

			// s1 is a string, so you cannot do math on it such as s1 = s1*5
			// to convert the string to an int, you have to PARSE it 

			num1 = Double.parseDouble(s1);
			num2 = Double.parseDouble(s1);
			System.out.println("Now " + num1 + " is converted into a double ...\n");
			System.out.println("....and we can do math with it 5*" +num1+ " = " +num1*5);
			System.out.println("....and we can do math with it 5*" + num2 + " = " + num2 * 3.1416);	

		}
}

/*
Desktop🌸javac parseNums.java
Desktop🌸java parseNums
Enter a sentence: 
Hey, this is a new sentence
the sentence you entered is: Hey, this is a new sentence

Now enter a number: 88
Now 88.0 is converted into a double ...

....and we can do math with it 5*88.0 = 440.0
Desktop🌸
*/

