package forloops;

import static java.lang.System.*;

public class BoxRunner
{
	public static void main ( String[] args )
	{
		Box test = new Box();
		test.setWord("hippo");
		test.print();
		
		Box test2 = new Box();
		test2.setWord("abcd");
		test2.print();
		
		Box test3 = new Box();
		test3.setWord("it");
		test3.print();
		
		Box test4 = new Box();
		test4.setWord("a");
		test4.print();
		
		Box test5 = new Box();
		test5.setWord("chicken");
		test5.print();
		
	}
}
