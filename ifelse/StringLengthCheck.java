package ifelse;


import static java.lang.System.*;

public class StringLengthCheck
{
	String wordOne, wordTwo;

	public StringLengthCheck()
	{
	}

	public StringLengthCheck(String one, String two)
	{
		wordOne=one;
		wordTwo=two;
	}

	public void setWords(String one, String two)
	{
		wordOne=one;
		wordTwo=two;
	}

	public boolean checkLength( )
	{
		if (wordOne.length() == wordTwo.length()) {
		return true;}
		
		else 
			return false;
	}

	public String toString()
	{
		if (checkLength() == false) 
		return wordOne + " does not have the same # of letters as " + wordTwo + "\n";
		
	
		return wordOne + " has the same # of letters as " + wordTwo + "\n";
	}
}