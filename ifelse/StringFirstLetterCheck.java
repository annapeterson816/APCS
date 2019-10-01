package ifelse;

import static java.lang.System.*;

public class StringFirstLetterCheck
{
	String wordOne, wordTwo;

	public StringFirstLetterCheck()
	{
	}

	public StringFirstLetterCheck(String one, String two)
	{
		wordOne=one;
		wordTwo=two;
	}

	public void setWords(String one, String two)
	{
		wordOne=one;
		wordTwo=two;
	}

	public boolean checkFirstLetter( )
	{
		
		char one = wordOne.charAt(0);
		char two = wordTwo.charAt(0);
		
		if (one == two) 
			return true;
			return false;
	}

	public String toString()
	{
		if (checkFirstLetter() == true) 
			return wordOne + " does have the same first letter as " + wordTwo + "\n";
		
			return wordOne + " does not have the same first letter as " + wordTwo + "\n";
	}
}
