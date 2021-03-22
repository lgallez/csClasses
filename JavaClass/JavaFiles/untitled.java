// Name: Layla Gallez
// Data: 6/21/2020
// Description: Example of an Object: Room
// File Name: Circle.java

class Circle
{
	
	double radius; //Data type, Variables

	Circle() //Default Constructor - sets the properties of a new room
	{
		radius = 10;
	}

	//Mutator Method
	void changeroom(double newL, double newW) //change the room
	{
		lenght = newL;
		width = newW;
	}

	//Accessor Method
	public String toString() //show the rooms properties
	{
		return "has a radius of " + radius
	}

	public static void main(String [] args)
	{
		Circle myCircle = new Circle();
		System.out.println("myCircle " + myCircle);

		myCircle.changeCircle(double newR);
		System.out.println("myCircle now " + myCircle);
	}

}

/*
Desktop🌸javac Room.java
Desktop🌸java Room
myRoom has a lenght of 25.0 ,and a width of 12.0
myRoom now has a lenght of 10.0 ,and a width of 20.0
Desktop🌸
*/