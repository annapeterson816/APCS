package Strings;

import static java.lang.System.*;

public class FirstRunner
{
	public static void main ( String[] args )
	{
		FirstAndLast demo = new FirstAndLast("Hello");
		System.out.println(demo);
		System.out.println( "first letter :: " + demo.getFirst() );
		System.out.println( "last letter :: " + demo.getLast() + "\n" );
		
		FirstAndLast demo2 = new FirstAndLast("World");
		System.out.println(demo2);
		System.out.println( "first letter :: " + demo2.getFirst() );
		System.out.println( "last letter :: " + demo2.getLast() + "\n" );
		
		FirstAndLast demo3 = new FirstAndLast("JukeBox");
		System.out.println(demo3);
		System.out.println( "first letter :: " + demo3.getFirst() );
		System.out.println( "last letter :: " + demo3.getLast()  + "\n");
		
		FirstAndLast demo4 = new FirstAndLast("TCEA");
		System.out.println(demo4);
		System.out.println( "first letter :: " + demo4.getFirst() );
		System.out.println( "last letter :: " + demo4.getLast() + "\n");
		
		FirstAndLast demo5 = new FirstAndLast("UIL");
		System.out.println(demo5);
		System.out.println( "first letter :: " + demo5.getFirst() );
		System.out.println( "last letter :: " + demo5.getLast() + "\n");
	}
}