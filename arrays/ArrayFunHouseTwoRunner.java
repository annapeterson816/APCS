package arrays;


import java.util.Arrays;

public class ArrayFunHouseTwoRunner
{
	public static void main( String args[] )
	{
		int[] one = {1,2,3,4,5,6,7,8,9,10};

		System.out.println(Arrays.toString(one));
		System.out.println("is going up? " + ArrayFunHouseTwo.goingUp(one));
		System.out.println("is going down? " + ArrayFunHouseTwo.goingDown(one));	
	
	int [] two ={9,8,7,6,5,4,3,2,0,-2};
			
	System.out.println(Arrays.toString(two));
	System.out.println("is going up? " + ArrayFunHouseTwo.goingUp(two));
	System.out.println("is going down? " + ArrayFunHouseTwo.goingDown(two));
	
	int [] three ={3,6,9,12,15,18,21,23,19,17,15,13,11,10,9,6,3,2,1,0};
	
	System.out.println("\n" + Arrays.toString(three));
	System.out.println("first 7 values greater than 9 " + ArrayFunHouseTwo.getCountValuesBiggerThanX(three, 7, 9));
	System.out.println("first 5 values greater than 15 " + ArrayFunHouseTwo.getCountValuesBiggerThanX(three, 5, 15));
	
}
}