package whileloops;

import static java.lang.System.*;

public class Divisors {
	public static String getDivisors(int number) {
		String divisors = "";
		int x = 1;
		while (x < number) {
			if (number % x == 0) {
				divisors = divisors + x + "  ";

			}
			x++;
		}
		return divisors;
	}
}