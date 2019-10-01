package whileloops;

import static java.lang.System.*;

public class ReverseNumber
{
   private int number;

	//add constructors
   
   public ReverseNumber(int num)
	{
		setNumber(num);
	}
	
	
	public void setNumber(int num)
	{
		 number=num;
	}


	public int getReverse(int number)
	{
		int rev=0;	
		int num=number;
		
		while (num>0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		return rev;
	}

	public String toString()
	{
		return number + " reversed is " ;
	}
	
}
