package whileloops;

import static java.lang.System.*;

public class DivisorsRunner
{
	public static void main( String args[] )
	{
		System.out.println( "10 has divisors " +Divisors.getDivisors(10) ); 
		
		System.out.println( "45 has divisors " +Divisors.getDivisors(45) ); 
		
		System.out.println( "14 has divisors " +Divisors.getDivisors(14) ); 
		
		System.out.println( "1024 has divisors " +Divisors.getDivisors(1024) ); 
		
		System.out.println( "1245 has divisors " +Divisors.getDivisors(1245) ); 
		
		System.out.println( "33 has divisors " +Divisors.getDivisors(33) ); 
		
		System.out.println( "65535 has divisors " +Divisors.getDivisors(65535) ); 
	}
}