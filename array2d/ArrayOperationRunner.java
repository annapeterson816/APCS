package array2d;

public class ArrayOperationRunner {

	public static void main(String[] args) {
		
		
		int [] [] myArray = {
				{2,3,4,3},
				{1,1,1,1},
				{4,8,10,1}};
		System.out.println(ArrayOperation.getTotal(myArray));
		System.out.println(ArrayOperation.getAverage(myArray));
		System.out.println(ArrayOperation.getRowTotal(myArray,0));
		System.out.println(ArrayOperation.getColumnTotal(myArray,1));
		System.out.println(ArrayOperation.getHighestInRow(myArray, 2));
		System.out.println(ArrayOperation.getLowestInRow(myArray,1));

	}

}
