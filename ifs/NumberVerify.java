package ifs;


import static java.lang.System.*;

public class NumberVerify
{
	public static boolean isOdd( int num )
	{
		
		if (Math.abs(num) % 2 == 1) 
		return true;
		
		else
		return false;
		
	}
		

	public static boolean isEven( int num )
	{
		if (Math.abs(num) % 2 == 0) 
		return true; 
		
		else 
		return false;
		
	}	
}