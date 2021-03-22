// Layla Gallez
// Page Number
// 6/17/2020
// Description 

class Room
{
	
	double width, lenght; //Data Items

	// Methods to change and look at the data items
	void c()
	{
		width = 1.1;
		lenght = 2.2;
	}

	void L()
	{
		System.out.println("width = " + width+". lenght = " + lenght);
	}

	// Another method to calculate floor area
	void area()
	{
		double area = width*lenght;
		System.out.println("The area is " + area);
	}

	public static void main(String[] args)
	{
		Room aRoom = new Room();
		aRoom.L();
		aRoom.area();
		aRoom.c();
		aRoom.L();
		aRoom.area();
	}

}

/*
Desktop🌸javac Room.java
Desktop🌸java Room
width = 0.0. lenght = 0.0
The are is 0.0
width = 1.1. lenght = 2.2
The are is 2.4200000000000004
Desktop🌸
*/

