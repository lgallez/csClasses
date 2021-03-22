// Name: Layla Gallez
// Data: 6/26/2020
// Description: Acessor, Mutator. Constructor
// File Name: Triangle.java

class Triangle
{
	// instance variables
	int sideOne, sideTwo, sideThree;

	// constructor
	Triangle(int newOne, int newTwo, int newThree)
	{
		sideOne = newOne;
		sideTwo = newTwo;
		sideThree = newThree;
	}

	// mutators
	void changeOne(int newOne) {sideOne = newOne;}
	void changeTwo(int newTwo) {sideTwo = newTwo;}
	void changeThree(int newThree) {sideThree = newThree;}

	// accessors 
	int getOne() {return sideOne;}
	int getTwo() {return sideTwo;}
	int getThree() {return sideThree;}

	// method that returns the sum of all sides
	int sum(int side1, int side2, int side3)
	{
		return side1 + side2 + side3;
	}

	public static void main(String[] args)
	{
		// make new box
		Triangle tri = new Triangle(1,2,3);
		// change it
		tri.changeOne(10);
		tri.changeTwo(20);
		tri.changeThree(30);
		// show sum of all sides 
		int s = tri.sum(10,20,30);
		System.out.println("sum of 3 sides = " + s);
	}

}

/*
Desktop🌸java Triangle.java
sum of 3 sides = 60
Desktop🌸clear
Desktop🌸javac Triangle.java
Desktop🌸java Triangle
sum of 3 sides = 60
Desktop🌸
*/