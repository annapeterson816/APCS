package arraysort;

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSearch
{
	public static int getNextLargest(int[] numArray, int searchNum)
	{
		int magicNum=1000;
		for (int i=0; i<numArray.length; i++){
		if (Math.abs(numArray[i] - searchNum)< magicNum && numArray[i]>searchNum){
			magicNum=numArray[i];}
		
			}
		return magicNum;
	}
}