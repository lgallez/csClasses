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
	void changeCircle(double newR) //change the room
	{
		radius = newR;
	}

	//Accessor Method
	public String toString() //show the rooms properties
	{
		return "has a radius of " + radius;
	}

	public static void main(String [] args)
	{
		Circle myCircle = new Circle();
		System.out.println("myCircle " + myCircle);

		myCircle.changeCircle(20);
		System.out.println("myCircle now " + myCircle);
	}

}

/*
Desktop🌸javac Circle.java
Desktop🌸java Circle
myCircle has a radius of 10.0
myCircle now has a radius of 20.0
Desktop🌸
*/