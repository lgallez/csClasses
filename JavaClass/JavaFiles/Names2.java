// Name: Layla Gallez
// Data: 6/26/2020
// Description: method development - swap
// File Name: Names.java

class Names 
{
	// data declaration section
	String first, middle, last;

	// method definition section
	Names() // Default Constructor - makes the same names every time
	{
		first = "Layla";
		middle = "Nicole";
		last = "Gallez"; 
	}

	Names(String newF, String newM, String newL) // Explicit Constructor - makes different names
	{
		first = newF;
		middle = newM;
		last = newL; 
	}

	void changeFirst(String newF) // mutator
	{
		first = newF;
	}

	void sawp()
	{
		String temp;
		temp = first;
		first = last;
		last = temp;
	}

	public String toString()
	{
		return first + " " + middle + " " + last;
	}
}

/*
I know in pythom I would call the file by imput, 
and i understand how to call for a file in JS but I'm not seeing how to do it for Java

Desktop🌸javac Names.java
Desktop🌸java Names
Error: Main method not found in class Names, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application
Desktop🌸
*/