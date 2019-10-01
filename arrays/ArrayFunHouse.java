package arrays;

import java.lang.System;
import java.lang.Math;

public class ArrayFunHouse
{
	//instance variables and constructors could be used, but are not really needed

	//getSum() will return the sum of the numbers from start to stop, not including stop
	public static int getSum(int[] numArray, int start, int stop)
	{
		int sum =0;
		for (int i =start; i<=stop; i++)
			sum =sum + numArray[i];
		return sum;
	}

	//getCount() will return number of times val is present
	public static int getCount(int[] numArray, int val)
	{
		int sum=0;
		for(int i=0; i<numArray.length; i++)
			if (numArray[i]==val)
				sum++;
		
		return sum ;
	}

	public static int[] removeVal(int[] numArray, int val)
	{
		int sum=0;
		int [] myArray = new int [numArray.length-getCount(numArray,val)];
		for (int num : numArray )
		if (num != val){
			myArray[sum]=num;
			sum++;
		}
		return myArray;
	}
}