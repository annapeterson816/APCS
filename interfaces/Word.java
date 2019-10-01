package interfaces;

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word=s;
	}

	public int compareTo( Word other )
	{	
		
		if (this.word.length() > other.word.length())
		return 1;
		
		if (this.word.length() < other.word.length())
		return -1;
		
		 return this.word.compareTo(other.word);
			
	}

	public String toString()
	{
		return "" + word;
	}
}