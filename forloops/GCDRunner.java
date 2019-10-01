package forloops;

import static java.lang.System.*;

public class GCDRunner
{
	public static void main ( String[] args )
	{
		GCD test = new GCD();
		test.setNums(5, 25);
		System.out.println(test);
		
		GCD test2 = new GCD();
		test2.setNums(4,400);
		System.out.println(test2);
		
		GCD test3 = new GCD();
		test3.setNums(8,80);
		System.out.println(test3);
		
		GCD test4 = new GCD();
		test4.setNums(15,45);
		System.out.println(test4);
		
		GCD test5 = new GCD();
		test5.setNums(9,9);
		System.out.println(test5);
		
		GCD test6 = new GCD();
		test6.setNums(3,543);
		System.out.println(test6);
		
	}
}