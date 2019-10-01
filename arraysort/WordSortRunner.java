package arraysort;

import java.util.Arrays;

import arrays.Grades;

import static java.lang.System.*;

public class WordSortRunner
{
	public static void main(String args[])
	{
		 
	
		WordSort test = new WordSort("abc ABC 12321 fred alexander");
		
		test.sort();
		System.out.println(test);
		
		}
	}
