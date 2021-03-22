// Name: Layla Gallez
// Data: 6/28/2020
// Description: shows how UseName.java file uses Name.java
// File Name: UseName.java

class UseName
{
	public static void main(String[] args)
	{
		// me and someone are each an instance of the names class
		Name me = new Name("Layla");
		Name you = new Name("Ashley"); // calls explicit constructor 
		System.out.println("me = " + me); // Layla
		System.out.println("you = " + you); // Ashley
		me.swap();
    System.out.println("me = " + me); // Layla
    System.out.println("you = " + you); // Ashley
	}
}

/*
Desktop🌸javac UseName.java
UseName.java:15: error: cannot find symbol
                me.swap(you);
                  ^
  symbol:   method swap(Name)
  location: variable me of type Name
1 error
Desktop🌸
*/