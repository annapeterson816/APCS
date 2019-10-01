package arrays;
import java.lang.System;
import java.util.Arrays;
import java.lang.Math;

public class ArrayFunHouseTwo
{
	//goingUp() will return true if all numbers
	//in numArray are in increasing order
	//[1,2,6,9,23] returns true
	//[9, 11, 13, 8]  returns false
	public static boolean goingUp(int[] numArray)
	{
		for(int i =1; i<numArray.length; i++)
			if (numArray[i]>numArray[i-1])
				return true;
		return false;
	}

	//goingDown() will return true if all numbers
	//in numArray are in decreasing order
	//[31,12,6,2,1] returns true
	//[31, 20, 10, 15, 9] returns false
	public static boolean goingDown(int[] numArray)
	{
		for (int i =1; i <numArray.length; i++)
			if (numArray[i]>numArray[i-1])
					return false;
		return true;
	}

	//getValuesBiggerThanX will return an array that contains
	//count number of values that are larter than parameter x
	//[1,2,3,4,5,6,7,8,9,10,11,6],3,5  would return [6,7,8]
	public static String getCountValuesBiggerThanX(int[] numArray, int count, int x)
	{
		int spot =0;
		int [] hiArray = new int [count];
		for (int i=0; i< count; i++ )
			if (numArray[i]>x){
				hiArray[spot] = numArray[i];
				spot++;
			}
				
		return Arrays.toString(hiArray);
	}
}