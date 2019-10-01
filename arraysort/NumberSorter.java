package arraysort;


import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	

	public static int[] getSortedDigitArray(int number)
	{
		
		
		int count =0;
		int jankNum = number;
			for (int i=(Integer.toString(jankNum)).length();i>0;i--){
				count++;
				jankNum/=10;
			}
			
			
		int[] sorted = new int[count];
		for(int i=0; i<count; i++){
			sorted[i]=number%10;
			number=number/10;
		}
		 Arrays.sort(sorted);
		return sorted;
	}
}
