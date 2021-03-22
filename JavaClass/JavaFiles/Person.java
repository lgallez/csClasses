// Name: Layla Gallez
// Data: 6/25/2020
// Description: Acessor, Mutator. Constructor(Defailt, Explicit), Instance 
// File Name: Person.java

class Person
{
	// data declaration section
	String name; //instance variable
	int age; 	 //instance variable

	//method definition section
	Person() //Default Constructor - makes the same Person every time
	{
		name = "Alex";
		age = 36;
	}

	Person(String newName, int newAge) // Explicit Constructor - makes different Person
	{
		name = newName;
		age = newAge;
	}

	void changeName(String newName) //mutator
	{
		name = newName;
	}

	void changeAge(Integer newAge) //mutator2
	{
		age = newAge;
	}

	public String toString()
	{
		return "person's name = " + name + " , age = " + age;
	}

	public static void main(String[] args)
	{
		// "no" and "someone" are each an "INSTANCE" of the Person class
		Person me = new Person(); // calls default constructor
		Person Layla = new Person("Layla", 31); // calls explicit constructor
		System.out.println(me); // alex 36
		me.changeName("Alex");
		System.out.println(me); // Alex 36
		System.out.println(Layla); // Ellen 56
	}

}

/*
Desktop🌸javac Person.java
Desktop🌸java Person
person's name = Alex , age = 36
person's name = Alex , age = 36
person's name = Layla , age = 31
Desktop🌸
*/