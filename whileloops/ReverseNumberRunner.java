package whileloops;

import static java.lang.System.*;

public class ReverseNumberRunner
{
	public static void main( String args[] )
	{
		ReverseNumber test = new ReverseNumber(234);
		out.print(test);
		out.println(test.getReverse(234));
		
		ReverseNumber test2 = new ReverseNumber(10000);
		out.print(test2);
		out.println(test2.getReverse(10000));
		
		ReverseNumber test3 = new ReverseNumber(111);
		out.print(test3);
		out.println(test3.getReverse(111));
		
		ReverseNumber test4 = new ReverseNumber(9005);
		out.print(test4);
		out.println(test4.getReverse(9005));
		
		ReverseNumber test5 = new ReverseNumber(84645);
		out.print(test5);
		out.println(test5.getReverse(84645));
		
		ReverseNumber test6 = new ReverseNumber(8547);
		out.print(test6);
		out.println(test6.getReverse(8547));
		
		ReverseNumber test7 = new ReverseNumber(123456789);
		out.print(test7);
		out.println(test7.getReverse(123456789));
	}
}