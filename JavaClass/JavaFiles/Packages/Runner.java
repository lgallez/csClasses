import one.One;
import one.four.*;
import one.four.two.*;
import one.four.two.five.Five;

class Runner
{
	public static void main(String[] args)
	{
		One edin = new One();
		edin.one();

		Four chetiri = new Four();
		chetiri.four();

		Two dva = new Two();
		dva.two();

		Three tri = new Three();
		tri.three();

		Five pet = new Five();
		pet.five();		
	}
	
}