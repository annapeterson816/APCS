package forloops;

import static java.lang.System.*;

public class GCD {
	private int one, two;

	public GCD() {
	}

	public GCD(int numOne, int numTwo) {
		one = numOne;
		two = numTwo;
	}

	public void setNums(int numOne, int numTwo) {
		one = numOne;
		two = numTwo;
	}

	public long getGCD() {
		 long gcd=0;
		for (int i = one; i >=1; i--) {
			if (one % i == 0 && two % i == 0) {
				return i;
			}
		}

		return 1;
	}

	public String toString() {
		return "the gcd of " + one + " and " + two + " is " + getGCD();
	}
}