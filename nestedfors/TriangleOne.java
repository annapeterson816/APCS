package nestedfors;

import static java.lang.System.*; 
import java.util.Scanner;

public class TriangleOne
{
   

	public static String createTriangle( String let, int size)
	{
		String output="";
		for (int i =1; i<=size; i++ ){
			
			for (int j=1; j<=i; j++ ){
				
			output= output+let;}
			
		output= output + "\n";
		}
		return output;
	}
}