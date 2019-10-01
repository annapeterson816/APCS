package ifelse;

import static java.lang.System.*;

import ifs.NumberCompare;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		StringEquality test = new  StringEquality("hello", "goodbye");
		out.println(test);
		
		test.setWords("one", "two");
			out.println(test);
			
			test.setWords("three", "four");
			out.println(test);
			
			test.setWords("TCEA", "UIL");
			out.println(test);
			
			test.setWords("State", "Champion");
			out.println(test);
			
			test.setWords("ABC", "ABC");
			out.println(test);
		   
			test.setWords("ABC", "CBA");
			out.println(test);
			
			test.setWords("Same", "Same");
			out.println(test);
			
	}
}