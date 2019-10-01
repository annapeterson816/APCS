package ifelse;


import static java.lang.System.*;

public class Social
{
   private String socialNum;
   private int sum;

	public Social()
	{
	}

	public Social(String w)
	{
		socialNum=w;
		
	}


	public void setWord(String w)
	{
		
		socialNum=w;
	
	}

	public void chopAndAdd()
	{
	
		String one = socialNum.substring(0, socialNum.indexOf('-'));
		String two=socialNum.substring(socialNum.indexOf('-') + 1, socialNum.lastIndexOf('-'));
		String three=socialNum.substring(socialNum.lastIndexOf('-')+1);
		
		sum= Integer.parseInt(one) + Integer.parseInt(two) + Integer.parseInt(three);
	}

	public String toString()
	{
		return "SS# " + socialNum + " has a total of " + sum + "\n";
	}
}