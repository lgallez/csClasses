// Name: Layla Gallez
// Data: 6/26/2020
// Description: shows how useNames.java file uses Names.java
// File Name: UseNames.java

class UseNames
{
	public static void main(String[] args)
	{
		// me and someone are each an instance of the names class
		Names me = new Names();
		Names someone = new Names("Ashley", "Lauren", "Cruz"); // calls explicit constructor 
		System.out.println(me); // Layla Nicole Gallez
		System.out.println(someone); // Ashley Lauren Cruz
		someone.swap();
		System.out.println(someone); // Nicole Lauren Ashley
	}
}

/*
Desktop🌸javac useNames.java
useNames.java:11: error: cannot find symbol
                Names me = new Names();
                ^
  symbol:   class Names
  location: class UseNames
useNames.java:11: error: cannot find symbol
                Names me = new Names();
                               ^
  symbol:   class Names
  location: class UseNames
useNames.java:12: error: cannot find symbol
                Names someone = new Names("Ashley", "Lauren", "Cruz"); // calls explicit constructor
                ^
  symbol:   class Names
  location: class UseNames
useNames.java:12: error: cannot find symbol
                Names someone = new Names("Ashley", "Lauren", "Cruz"); // calls explicit constructor
                                    ^
  symbol:   class Names
  location: class UseNames
4 errors
Desktop🌸
*/