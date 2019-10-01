package forloops;

import static java.lang.System.*;

public class Box
{
	private String word;

	public Box()
	{
	}

	public Box(String s)
	{
		word= s;
	}

	public void setWord(String s)
	{
		word=s;
	}

	public void print( )
	{
		for ( int i = 0; i < word.length(); i++){
			
		System.out.println(word);
	
		}
		System.out.println("\n");
	}
}

