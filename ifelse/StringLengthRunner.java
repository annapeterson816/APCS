package ifelse;


import static java.lang.System.*;

public class StringLengthRunner
{
	public static void main( String args[] )
	{
		StringLengthCheck test = new  StringLengthCheck("hello", "goodbye");
		out.println(test);
		
		test.setWords("one", "two");
			out.println(test);
			
			test.setWords("three", "four");
			out.println(test);
			
			test.setWords("TCEA", "UIL");
			out.println(test);
			
			test.setWords("State", "Champion");
			out.println(test);
			
			test.setWords("ABC", "DEF");
			out.println(test);
		   
			test.setWords("four", "five");
			out.println(test);
			
			test.setWords("whoot", "what");
			out.println(test);
				
	}
}