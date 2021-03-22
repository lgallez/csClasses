// Name: Layla Gallez
// Data: 6/21/2020
// Description: Example of an Object: Room
// File Name: Room.java

class Room
{
	
	double width, lenght; //Data type, Variables

	Room() //Default Constructor - sets the properties of a new room
	{
		lenght = 25.0;
		width = 12.0;
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
		return "has a lenght of " + lenght + " ,and a width of " + width;
	}

	public static void main(String [] args)
	{
		Room myRoom = new Room();
		System.out.println("myRoom " + myRoom);

		myRoom.changeroom(10,20);
		System.out.println("myRoom now " + myRoom);
	}

}

/*
Desktop🌸javac Room.java
Desktop🌸java Room
myRoom has a lenght of 25.0 ,and a width of 12.0
myRoom now has a lenght of 10.0 ,and a width of 20.0
Desktop🌸
*/