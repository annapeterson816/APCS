package forloops;

import static java.lang.System.*;
import java.lang.Math;

public class Prime
{
	private int number;

	public Prime()
	{
	}

	public Prime(int num)
	{
		number=num;
	}

	public void setPrime(int num)
	{
		number=num;

	}

	public boolean isPrime()
	{
			int factor=0;
			int answer=0;
		for (int i =2; i<= Math.sqrt(number); i++) {
			if (number % i ==0) 
				answer = answer +1; 
			else 
				answer= answer+0;
			
				
			}
		
		if (answer==0)
			return true;
			else 
				return false;

		
	}

	public String toString()
	{
		String output="";
		
		if (isPrime()== false)
		output= number + " is not prime \n \n";
		
		else 
			output= number + " is prime \n \n";

		return output;
	}
}