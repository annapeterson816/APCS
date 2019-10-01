package forloops;

import static java.lang.System.*;
import java.lang.Math;

public class PrimeRunner
{
	public static void main ( String[] args )
	{
		Prime test = new Prime();
		test.setPrime(24);
		System.out.print(test);
		
		Prime test2 = new Prime();
		test2.setPrime(7);
		System.out.print(test2);
		
		Prime test3 = new Prime();
		test3.setPrime(100);
		System.out.print(test3);
		
		Prime test4 = new Prime();
		test4.setPrime(113);
		System.out.print(test4);
		
		Prime test5 = new Prime();
		test5.setPrime(65535);
		System.out.print(test5);
		
		Prime test6 = new Prime();
		test6.setPrime(2);
		System.out.print(test6);
		
		Prime test7 = new Prime();
		test7.setPrime(7334);
		System.out.print(test7);
		
		Prime test8 = new Prime();
		test8.setPrime(7919);
		System.out.print(test8);
		
		Prime test9 = new Prime();
		test9.setPrime(1115125003);
		System.out.print(test9);
	}	
}
