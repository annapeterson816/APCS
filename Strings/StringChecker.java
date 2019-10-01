package Strings;

import static java.lang.System.*;

public class StringChecker {
	private String word;

	public StringChecker() {
	}

	public StringChecker(String s) {
		word = s;
	}

	public void setString(String s) {
		word = s;
	}

	public boolean findLetter(char c) {

		int a = word.indexOf(c);
		boolean b = false;
		if (a > -1 )
			b = true;
		
		
		if (a == -1)
			b = false;
		return b;

	}

	public boolean findSubString(String s) {
		if (word.indexOf(s) > -1)
			return true;
		return false;
	}

	public String toString() {
		return word + "\n\n";
	}
}
