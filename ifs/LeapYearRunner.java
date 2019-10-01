package ifs;

import static java.lang.System.*; 
import java.util.Scanner;

public class LeapYearRunner
{
	public static void main( String args[] )
	{
		
		Scanner keyboard = new Scanner(System.in);
		int One;
		
		LeapYear demo = new LeapYear();
		
		out.println("Enter a year ::");
		One = keyboard.nextInt();
		
		
		out.println(LeapYear.isLeapYear(One));
	}
}