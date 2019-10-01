package whileloops;

import static java.lang.System.*;

public class Perfect {
	private static int number;

	public Perfect() {

	}

	public static void setNums(int num) {
		number = num;
	}

	public static boolean isDivisors(int num) {

		int divisors = 0;
		int x = 1;
		while (x < number) {
			if (number % x == 0) {
				divisors = divisors + x;

			}
			x++;
		}
		if (divisors==number) 
			return true;
		return false;
			
}
	public String toString()
	{
		if( isDivisors(number) == true){
			
		return number + " is perfect"; }
		
			return number + " is not perfect"
		
		;
	}
}