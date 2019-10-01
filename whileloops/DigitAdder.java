package whileloops;

import static java.lang.System.*; 

public class DigitAdder
{
   public static int sumDigits( int number )
	{
	   int sum=0;
	   int num=number;
	 while (num>0){
		 
	   sum=sum + num%10;
	   num/=10;}
		
		return sum;
	}
}