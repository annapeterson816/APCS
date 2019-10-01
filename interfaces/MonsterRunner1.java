package interfaces;


import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner1 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int size;
		String name;
		out.print("Enter 1st monster's name : ");
		name = scan.next();
		out.print("Enter 1st monster's size : ");
		size = scan.nextInt();
		Monster mOne = new Skeleton(name, size);

		out.print("Enter 2nd monster's name : ");
		name = scan.next();
		out.print("Enter 2nd monster's size : ");
		size = scan.nextInt();
		Monster mTwo = new Skeleton(name, size);

		if (mOne.isBigger(mTwo) == true) {
			out.println("Monster one is bigger than Monster two.");
		}
		if (mOne.isSmaller(mTwo) == true) {
			out.println("Monster one is smaller than Monster two.");
		}
		if (mOne.namesTheSame(mTwo) == true) {
			out.println("Monster one has the same name as Monster two.");
		}
	}
}