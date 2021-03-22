// Name: Layla Gallez
// Data: 7/13/2020
// Description: having a method call itself
// File Name: Recursive.java

class Recursive
{
	public static int factorial(int n)
	{
		if (n == 1)
				return 1;

		else 
			return (n * factorial(n+(n - 1)));
	}

	public static void main(String[] args)
	{
		int n = 3;
		int sum;
		int result;

		result = factorial(n);
		System.out.println("The factorial of " + n + " is " + result);
	}
}	

/* 
JavaFiles🌸javac Recursive.java 
JavaFiles🌸java Recursive
The factorial of 3 is 1688916503
JavaFiles🌸
*/ 