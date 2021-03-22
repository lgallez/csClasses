// Name: Layla Gallez
// Data: 7/7/2020
// Description: Doing loops
// File Name: WhileLoop.java

class WhileLoop
{
	public static void main(String[] args)
	{
		int stop = 20;
		int start = 10;
		int increment = 1;
		double gallons;
		double liters;

		 System.out.println("Gallons		Liters");

		 gallons = start;
		 while(gallons <= stop)
		 {
		 	liters = 3.785 * gallons;
		 	System.out.printf("%2.0f		%5.2f \n", gallons, liters);
		 	gallons = gallons + increment;
		 }
	}

}

/*
JavaFiles🌸javac WhileLoop.java
JavaFiles🌸java WhileLoop
Gallons		Liters
10		37.85 
11		41.64 
12		45.42 
13		49.21 
14		52.99 
15		56.78 
16		60.56 
17		64.35 
18		68.13 
19		71.92 
20		75.70 
JavaFiles🌸
*/