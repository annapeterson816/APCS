package Strings;

import static java.lang.System.*;

public class FirstAndLast
{
	private String word;

	public FirstAndLast(String s)
	{
		word = s;
	}

	public void setString(String s)
	{
		word = s;
	}

	public String getFirst()
	{
		
		return word.substring(0,1);
	}
	
	public String getLast()
	{
		return word.substring(word.length()-1 , word.length()); 
	}

 	public String toString()
 	{
 		String output =  "word : " + word; //"\n" + "first letter :: " + getFirst() + "\n" + "last letter :: " + getLast() + "\n\n";
 		return output;
	}
}