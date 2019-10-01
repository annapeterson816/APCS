package array2d;


import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class MatrixUtilities {
	public static int arraySum(int[] arr) {

		int sum = 0;
		
		for (int i=0; i<arr.length; i++){
			sum+= arr[i];
		}
		return sum;

	}

	public static int[] rowSums(int[][] arr2D) {
		int sum=0;
		int[] returnArray = new int[arr2D.length];
		
		for (int r=0; r<arr2D.length; r++){
			for(int c=0;c<arr2D[0].length; c++){
				sum+=arr2D[r][c];
			}
			returnArray[r]=sum;
			sum=0;
		}

		return returnArray;
	}

	public static boolean isDiverse(int[][] arr2D) {

		int [] ray = rowSums(arr2D);
		int yes =0;
		for(int i=0; i<ray.length -1; i++)
			if(ray[i] == ray [i+1]){
				yes=1;
			}
		
		if (yes ==1)
			return false;
		
		return true;
	}

	public static void printMatrix(int[][] arr2D) {
		for (int i = 0; i < arr2D.length; i++) {
			System.out.println(Arrays.toString(arr2D[i]));
		}
	}
}
