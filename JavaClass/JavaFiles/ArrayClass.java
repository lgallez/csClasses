// Name: Layla Gallez
// Data: 7/18/2020
// Description: Doing Array Class
// File Name: ArrayClass.java

class ArrayClass
{
	public static void showArray(double c[])
	{
		System.out.print("Array = {");

		int k;

		for (k=0; k<c.length-1; k++)
			{System.out.print(c[k] + ",");}
		System.out.print(c[k] + "} \n");
	}

	public static void bubbleSort(double x[])
	{
		for (int j=0; j<x.length-1; j++)
		{
			for (int i=0; i<x.length-1; i++)
			{
				if (x[i] > x[i+1])
				{
					double temp = x[i];
					x[i] = x[i+1];
					x[i+1] = temp;
				}
			}
		}
	}

	public static void main(String[] args)
	{
		double X[] = {4.4,3.3,2.2,1.1};
		showArray(X);
		bubbleSort(X);
		showArray(X);
	}
}

/*
JavaFiles🌸javac ArrayClass.java 
JavaFiles🌸java ArrayClass
Array = {4.4,3.3,2.2,1.1} 
Array = {1.1,2.2,3.3,4.4} 
JavaFiles🌸
*/