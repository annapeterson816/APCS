package arrays;

import java.util.Scanner;

public class OddsAndEvens
{
	private static int countEm(int[] array, boolean even)
	{
		int num =0;
		if (even==true){
			for (int i=0; i<array.length; i++){
				if (array[i] % 2 ==0){
					num++;
				}
			}
		}
		if (even==false){
			for (int i=0; i<array.length; i++){
				if (array[i] % 2 !=0){
					num++;
				}
			}
		}
	
		return num;
	}
	
	public static int[] getAllEvens(int[] array)
	{
		int place=0;
		int [] newArray= new int[countEm(array,true)];
		for (int i=0; i<array.length; i++){
			if (array[i] % 2 == 0){
				newArray[place]=array[i];
				place++;
			}
		}
		return newArray;
	}

	public static int[] getAllOdds(int[] array){
		
	int place=0;
	int [] newArray= new int[countEm(array,false)];
	for (int i=0; i<array.length; i++){
		if (array[i] % 2 != 0){
			newArray[place]=array[i];
			place++;
		}
	}
	return newArray;		
	}
}