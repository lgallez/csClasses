// Name: Layla Gallez
// Data: 7/12/2020
// Description: Both for loops and conversions 
// File Name: QuickTest64.java

import java.text.*;

class QuickTest64
{
	public static void main(String[] args)
	{
		final int MAXCELSIUS = 60;
		final int STARTVAL = -10;
		final int STEPSIZE = 10;
		int celsius;
		double fahren;

		DecimalFormat cf = new DecimalFormat("00");
		DecimalFormat ff = new DecimalFormat("000");

		System.out.println("DEGREES		DEGREES");
		System.out.println("CELSIUS		FAHRENHEIT");
		System.out.println("-------		----------");

		celsius = STARTVAL;
		while (celsius <= MAXCELSIUS)
		{
			fahren = (9.0/5.0) * celsius + 32.0;
			System.out.print(" " + cf.format(celsius));
			System.out.println("		 " + ff.format(fahren));
			celsius = celsius + STEPSIZE;
		}
	}
}

/*
JavaFiles🌸javac QuickTest64.java 
JavaFiles🌸java QuickTest64
DEGREES		DEGREES
CELSIUS		FAHRENHEIT
-------		----------
 -10		 014
 00		 032
 10		 050
 20		 068
 30		 086
 40		 104
 50		 122
 60		 140
JavaFiles🌸
*/