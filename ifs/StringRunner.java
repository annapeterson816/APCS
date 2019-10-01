package ifs;




import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		String word;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a word : : ");
		 word = keyboard.nextLine();
		 
		 System.out.println(word + " is " + StringOddOrEven.isEven(word) + ".");
	}
}
