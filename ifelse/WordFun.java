package ifelse;


import static java.lang.System.*;

public class WordFun
{
	private String word, final1;

	public WordFun()
	{
	}

	public WordFun(String w)
	{
		word=w;
	}

	public void setWord(String w)
	{
		word=w;
	}

	public String makeUpper()
	{
		return word.toUpperCase();
		
		
	}

	public void addHyphen()
	{
		int loc, loc2;
		
		loc= makeUpper().indexOf(" ");
		loc2= loc+1;
		
		final1 = makeUpper().substring(0, loc) + "-" + makeUpper().substring(loc2);

		

	}

	public String toString()
	
	{
		return "" + word + "\n \n \n" + makeUpper() + "\n \n \n" + final1 + "\n \n";
		
	
		
	}
}