// Name: Layla Gallez
// Data: 7/16/2020
// Description: Doing shallow Arrays
// File Name: arrayShallow.java

import java.util.Scanner;

class arrayShallow
{
	public static void main(String[] args)
	{
		int a[] = {1,2,3};
		int b[];
		b = a;

		b[0] = 10;
		b[1] = 20;
		b[2] = 30;

		for (int i = 0; i < 3; i++)
		{
			System.out.println("a["+i+"]=" + a[i]);
			System.out.println("b["+i+"]=" + b[i]);
		}

		b[0] = -10;
		b[1] = -20;
		b[2] = -30;

		for (int i = 0; i < a.length; i++)
		{
			System.out.println("a["+i+"]=" + a[i]);
			System.out.println("b["+i+"]=" + b[i]);
		}
	}
}

/*
JavaFiles🌸javac arrayShallow.java 
JavaFiles🌸java arrayShallow
a[0]=10
b[0]=10
a[1]=20
b[1]=20
a[2]=30
b[2]=30
a[0]=-10
b[0]=-10
a[1]=-20
b[1]=-20
a[2]=-30
b[2]=-30
JavaFiles🌸
*/