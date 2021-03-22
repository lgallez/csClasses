// Name: Layla Gallez
// Data: 6/21/2020
// Description: Example of ++ and += operators
// File Name: Operator.java

class Operator
{
	
	int num; //variable = property

	//Methods 
	//Default Constructor
	Operator() //make equal to 0 initially
	{
		num = 0;
	}

	// Mutator Method 1:
	void increment() // increase num by 1
	{
		num++; // num = num + 1
	}

	// Mutator Method 2:
	void incrementBy(int anotherNum) // increase num by anotherNum
	{
		num += anotherNum; // num = num + anotherNumber
	} 

	// Mutator Method 3:
	void decrement() // increase num by anotherNum
	{
		num--; // num = num - 1
	} 

	// Mutator Method 4:
	void decrementBy(int anotherNum) // increase num by anotherNum
	{
		num -= anotherNum; // num = num - anotherNumber
	} 

	// Accessor Method (shows the property of the object/class)
	public String toString()
	{
		return "num is equal to " + num;
	}

	public static void main(String [] args)
	{
		Operator op = new Operator();
		System.out.println(op);
		op.increment();
		System.out.println(op);
		op.incrementBy(10);
		System.out.println(op);
		op.decrement();
		System.out.println(op);
		op.decrementBy(20);
		System.out.println(op);
	}
}

/* 
Desktop🌸javac Operator.java
Desktop🌸java Operator
num is equal to 0
num is equal to 1
num is equal to 11
num is equal to 10
num is equal to -10
Desktop🌸
*/


