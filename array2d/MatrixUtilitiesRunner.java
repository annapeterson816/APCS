package array2d;


import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class MatrixUtilitiesRunner {
	public static void main(String[] args) {
		int[][] mat1 = { { 1, 3, 2, 7, 3 }, { 10, 10, 4, 6, 2 }, { 5, 3, 5, 9, 6 }, { 7, 6, 4, 2, 1 } };

		System.out.println("MatrixUtilities  --  print matrix");
		MatrixUtilities.printMatrix(mat1);

		System.out.println();
		System.out.println("MatrixUtilities  --  print array sums");

		for (int[] row : mat1)
			System.out.println(MatrixUtilities.arraySum(row));
		System.out.println();
		System.out.println("MatrixUtilities  --  print row sums");

		System.out.println(Arrays.toString(MatrixUtilities.rowSums(mat1)));
		System.out.println();
		System.out.println("MatrixUtilities  --   is diverse");
		System.out.println(MatrixUtilities.isDiverse(mat1));

		System.out.println("\n\nMatrixUtilities  --  print matrix");
		int[][] matrix2 = { { 4, 5, 6 }, { 4, 5, 6 }, { 7, 7, 7, 6 }, { 1, 2 } };
		MatrixUtilities.printMatrix(matrix2);

		System.out.println("\nMatrixUtilities  --   is diverse");
		System.out.println(MatrixUtilities.isDiverse(matrix2));

		/*
		 * OUTPUT
		 * 
		 * MatrixUtilities -- print matrix 
		 * [1, 3, 2, 7, 3] 
		 * [10, 10, 4, 6, 2] 
		 * [5,3, 5, 9, 6] 
		 * [7, 6, 4, 2, 1]
		 * 
		 * MatrixUtilities -- print array sums 
		 * 16 
		 * 32 
		 * 28 
		 * 20
		 * 
		 * MatrixUtilities -- print row sums 
		 * [16, 32, 28, 20]
		 * 
		 * MatrixUtilities -- is diverse 
		 * true
		 * 
		 * 
		 * 
		 * MatrixUtilities -- print matrix 
		 * [4, 5, 6] 
		 * [4, 5, 6] 
		 * [7, 7, 7, 6] 
		 * [1,2]
		 * 
		 * MatrixUtilities -- is diverse 
		 * false
		 * 
		 */
	}
}