package forloops;

import static java.lang.System.*;

public class WordRunner
{
	public static void main ( String[] args )
	{
		Word test = new Word();
		test.setString("Hello"); 
		out.println(test);	
		
		Word test2 = new Word();
		test2.setString("World"); 
		out.println(test2);	
		
		Word test3 = new Word();
		test3.setString("Jukebox"); 
		out.println(test3);	
		
		Word test4 = new Word();
		test4.setString("TCEA"); 
		out.println(test4);	
		
		Word test5 = new Word();
		test5.setString("UIL"); 
		out.println(test5);	
	}
}