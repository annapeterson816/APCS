package whileloops;

import static java.lang.System.*;

public class DigitMath
{
   private static int countDigits( int number )
	{
	   int num = number;
		int sum=0;
		while (num >0)
		{
			num/= 10;
			sum++;
			
		}
		
		return sum; 
		
	}

	private static int sumDigits( int number )
	{
		int sum=0;
		   int num=number;
		 while (num>0){
			 
		   sum=sum + num%10;
		   num/=10;}
			
			return sum;
	}

	public static double averageDigits( int number )
	{
	
		return (double)(sumDigits(number) / (double)(countDigits(number))); 
	}
}