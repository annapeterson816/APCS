package arraysort;


import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array( int size)
	{
		int[] array = new int[size];
		for (int i = 0; i < array.length; i = i + 1) {
			int x = (int) (Math.random() * 10 + 1);
			array[i] = x;
		}
		return array;

	}
	public static void shiftEm(int[] array)
	{
		for (int i = 0; i < array.length; i = i + 1) {
			int j = i;
			while (j < array.length && array[j] != 7) {
				j = j + 1;
			}
			System.out.println("This is j:: " + j + " ");
			if (j != i && j < array.length) {
				int t = array[j];
				System.out.println("\nthis is array[j] " + array[j]);
				System.out.println("this is array[i] " + array[i]);
				array[j] = array[i];
				array[i] = t;


	}
}
	}
}