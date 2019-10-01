package ifs;

import static java.lang.System.*; 
import java.util.Scanner;

public class LeapYear
{
	public static String isLeapYear( int year )
	{
		if (year %4 == 0) {
		return year + " is a leap year.";
		}
		
		return year + " is NOT a leap year.";
	}
}