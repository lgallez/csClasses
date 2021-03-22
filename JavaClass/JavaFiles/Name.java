// Name: Layla Gallez
// Data: 6/28/2020
// Description: method development - swap
// File Name: Name.java

class Name 
{
	// data declaration section
	String name;

	// method definition section
	Name(String newName) // Default Constructor - makes the same names every time
	{
		name = newName;
	}

	void changeName(String newName) // mutator
	{
		name = newName;
	}

	String getName()
	{
		return name;
	}

	void sawp(Name other_Name_object)
	{
		String temp;
		temp = this.name;
		this.name = other_Name_object.getName();
		other_Name_object.changeName(temp);
	}

	public String toString()
	{
		return name;
	}
}

/*
Desktop🌸javac Name.java
Desktop🌸java Name
Error: Main method not found in class Name, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application
Desktop🌸
*/