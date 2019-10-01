package ifelse;

import static java.lang.System.*;

public class StringFirstLetterRunner
{
	public static void main( String args[] )
	{
		StringFirstLetterCheck test = new StringFirstLetterCheck();
		
		test.setWords("hello", "howdy");
		test.checkFirstLetter();
			out.println(test);
			
		test.setWords("one", "two");
		test.checkFirstLetter();
			out.println(test);
		
		test.setWords("three", "two");
		test.checkFirstLetter();
			out.println(test);
			
		test.setWords("TCEA", "UIL");
		test.checkFirstLetter();
		out.println(test);
		
		test.setWords("State", "Champions");
		test.checkFirstLetter();
			out.println(test);
			
		test.setWords("ABC", "DEF");
			out.println(test);
		
		

	}
}
