class Repeat
{
	public static void main(String[] args)
	{
		/*
		System.out.println("********");
		System.out.println("********");
		System.out.println("********");
		System.out.println("********");
		*/
		// for loop , repetition
		// for ( start; stop; step)
		for (int i = 0; i <= 4; i+=1) // i = 0,1,2,3, 4
		{
			//System.out.println("********");
			System.out.println("i = " + i);
		}

		// rewrite the above using a while loop
		int j=0; // start
		while (j <= 4) // stop
		{
			System.out.println("while j = " + j);
			j+=1;// step
		}


		System.out.println("+++++++++++++++++");
		for (int i = 0; i <= 4; i+=2) // i = 0, 2, 4
			System.out.println("i = " + i);

		// rewrite the above using a while loop
		j=0; // start
		while (j <= 4) // stop
		{
			System.out.println("while j = " + j);
			j+=2;// step
		}

		System.out.println("+++++++++++++++++");
		for (int i = 4; i >= 0; i-=2) // i = 4, 2, 0
			System.out.println("i = " + i);

		// rewrite the above using a while loop
		j=4; // start
		while (j >= 0) // stop
		{
			System.out.println("while j = " + j);
			j-=2;// step
		}

	}
}