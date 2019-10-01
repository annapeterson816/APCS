package ifelse;

import static java.lang.System.*;

public class WordsCompare
{
	private String wordOne, wordTwo;
   private int compare;

	public WordsCompare()
	{
	}

	public WordsCompare(String one, String two)
	{
		wordOne=one;
		wordTwo=two;
	}

	public void setWords(String one, String two)
	{
		wordOne=one;
		wordTwo=two;
	}

	public boolean compare()
	{
		if (wordOne.compareTo(wordTwo) >=1)
			return true;
		
		else
			return false;
	}

	public String toString()
	{
		if(compare() == false )
		{
			return wordOne + " should be placed before " + wordTwo + "\n";
		}
		else
		{
			return wordOne + " should be placed after " + wordTwo + "\n";
		}
	}
}