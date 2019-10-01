package whileloops;

import static java.lang.System.*;

public class DigitCounterRunner
{
	public static void main( String args[] )
	{
		DigitCounter.countDigits(234);
		System.out.println(234 + " contains " + DigitCounter.countDigits(234) + " digits");
		
		DigitCounter.countDigits(10000);
		System.out.println(10000 + " contains " + DigitCounter.countDigits(10000) + " digits");
		
		DigitCounter.countDigits(111);
		System.out.println(111 + " contains " + DigitCounter.countDigits(111) + " digits");
		
		DigitCounter.countDigits(9005);
		System.out.println(9005 + " contains " + DigitCounter.countDigits(9005) + " digits");
		
		DigitCounter.countDigits(84645);
		System.out.println(84645 + " contains " + DigitCounter.countDigits(84645) + " digits");
		
		DigitCounter.countDigits(8547);
		System.out.println(8547 + " contains " + DigitCounter.countDigits(8547) + " digits");
		
		DigitCounter.countDigits(123456789);
		System.out.println(123456789 + " contains " + DigitCounter.countDigits(123456789) + " digits");
	}
}