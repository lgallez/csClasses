import java.util.*; // needed for access input stream classes

public class Exercise4.2
{
	public static void main(String[] args)
	{
		double num1;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		num1 = sc.nextDouble();
		System.out.println("You entered: " + num1);
		System.out.println("and we can do math with it "+num1+"*5 = " + num1*5);
	}
}

/*
Desktop🌸javac NumsScanner.java
Desktop🌸java NumsScanner
Enter a number: 5
You entered: 5.0
and we can do math with it 5.0*5 = 25.0
Desktop🌸
*/