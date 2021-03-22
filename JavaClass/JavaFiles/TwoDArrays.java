// Name: Layla Gallez
// Data: 7/18/2020
// Description: Doing 2-D Arrays
// File Name: TwoDArrays.java

class TwoDArrays
{
	static void show2d(int a[][] )
	{
		for (int i=0; i<a.length; i++)
		{
			for (int j=0; j<a[0].length; j++)
				System.out.println(a[i][j] + " ");
					
			System.out.println();			
		}
	}

	static void make2d(int a[][] )
	{
		int k = 0;
		for (int i=0; i<a.length; i++)
			for (int j=0; j<a[0].length; j++)
				a[i][j] = k++;

		1darray[k] = new int[10];
		int array [] = sorted1Darray;

		System.out.print("ARRAY = {");
		
		for (k = 0; k < array.length - 1; k++)
		{
			System.out.print(k);
		}
		
		System.out.print("}");
	}

	public static void main(String[] args)
	{
		int vals[][] = new int[4][5];
		make2d(vals);
		show2d(vals);	
	}
}

/*
JavaFiles🌸javac TwoDArrays.java
JavaFiles🌸java TwoDArrays
ARRAY = {012345678}0 
1 
2 
3 
4 

5 
6 
7 
8 
9 

10 
11 
12 
13 
14 

15 
16 
17 
18 
19 

JavaFiles🌸

*/