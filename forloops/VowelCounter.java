package forloops;

import static java.lang.System.*;

public class VowelCounter {
	private static String word;
	int num;

	public static String vowel(String s) {
		word = s;
		int num = 0;
		String str = "";
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o'
					|| word.charAt(i) == 0) {
				str += num;
				num++;
			} else {
				str += word.substring(i, i + 1);
			}

		}
		return str;
	}

}
