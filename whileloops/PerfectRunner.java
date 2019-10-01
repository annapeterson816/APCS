package whileloops;

import static java.lang.System.*; 

public class PerfectRunner
{
	public static void main( String args[] )
	{
		Perfect test = new Perfect();
		test.setNums(496);
		test.isDivisors(496);
		out.println(test);
		
		Perfect test2 = new Perfect();
		test2.setNums(45);
		test2.isDivisors(45);
		out.println(test2);
		
		Perfect test3 = new Perfect();
		test3.setNums(6);
		test3.isDivisors(6);
		out.println(test3);
		
		Perfect test4 = new Perfect();
		test4.setNums(14);
		test4.isDivisors(14);
		out.println(test4);
		
		Perfect test5 = new Perfect();
		test5.setNums(8128);
		test5.isDivisors(8128);
		out.println(test5);
		
		Perfect test6 = new Perfect();
		test6.setNums(1245);
		test6.isDivisors(1245);
		out.println(test6);
		
		
		
																
	}
}