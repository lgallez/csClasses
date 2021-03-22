// Layla Gallez
// Page Number
// 6/17/2020
// Description 

class Lottery
{
	int n1, n2, n3, n4; //data items - Variables

	// Data Types: types of information we can store into program
	// integers, float/double, string, characters
	// int = whole number
	// Float/Double = decimal numbers
	
	// Methods: ways to change or look at the data
	// Methods to look at the data
	void look()
	{
		System.out.println("n1="+n1+", n2="+n2+", n3="+n3+", n4="+n4);
	}

	// Method that changes the data
	void change()
	{
		n1=1;
		n2=2;
		n3=3;
		n4=4;
	}

	public static void main(String [] args)
	{
		Lottery myObject = new Lottery();
		myObject.look(); 
		myObject.change();
		myObject.look();
	}

/* Program Run
Desktop🌸javac Lottery.java
Lottery.java:26: error: reached end of file while parsing
	}
	 ^
1 error
*/
