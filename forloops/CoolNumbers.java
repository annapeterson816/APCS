package forloops;


import static java.lang.System.*;

public class CoolNumbers 
{
	int num; 
	
	public static boolean isCoolNumber( int num )
	{
		num = num;
		if ( num % 3 == 1 && num % 4 == 1 && num % 5 == 1 && num % 6 == 1) {
		 return true; }
		
		return false;
		
		
	}
	
	
	public static int countCoolNumbers( int stop )
	{
		
		int count = 0;
		for (int i = 6; i < stop; i++)
			{
			
			if (isCoolNumber(i))
				count++;
			}
		return count;
	}
}
