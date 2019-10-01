package ifs;


import static java.lang.System.*;

public class NumberCompareRunner
{
	public static void main( String args[] )
	{
	   NumberCompare test = new NumberCompare(5,6);
	   out.println(test);
	   out.println("largest == "+test.getLargest());
	   out.println("smallest == "+test.getSmallest()+"\n\n");

	   NumberCompare test2 = new NumberCompare(45,66);
	   out.println(test2);
	   out.println("largest == "+test2.getLargest());
	   out.println("smallest == "+test2.getSmallest()+"\n\n");
	   
	   NumberCompare test3 = new NumberCompare(-25,10324);
	   out.println(test3);
	   out.println("largest == "+test3.getLargest());
	   out.println("smallest == "+test3.getSmallest()+"\n\n");

	   NumberCompare test4 = new NumberCompare(324,12312);
	   out.println(test4);
	   out.println("largest == "+test4.getLargest());
	   out.println("smallest == "+test4.getSmallest()+"\n\n");

	   NumberCompare test5 = new NumberCompare(34,33);
	   out.println(test5);
	   out.println("largest == "+test5.getLargest());
	   out.println("smallest == "+test5.getSmallest()+"\n\n");

		


	}
}
