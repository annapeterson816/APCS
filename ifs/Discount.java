package ifs;

import static java.lang.System.*;
import java.util.Scanner;

public class Discount
{
	
	public static double getDiscountedBill(double amt)
	{
		if (amt >= 2000) 
		 
			return (amt*.85) ;
		
		return  amt;
	}
}