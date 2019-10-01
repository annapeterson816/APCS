package interfaces;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner {
	public static void main(String args[])  {

		// one way to create new Word objects and load a Word array (use Scanner)
		String names1 = "freddy at elephant whoooooodat alice tommy bobby it at about";
		Scanner scan = new Scanner(names1);
		
		Word[] words1 = new Word[10];
		int i = 0;
		while (scan.hasNext()) {
			words1[i] = new Word(scan.next());
			i++;
		}
		
		System.out.println("before sorted: ");
		for (Word word : words1) {
			out.println(word);
		}
		System.out.println();
		
		System.out.println("after sorted: ");
		Arrays.sort(words1);
		for (Word word : words1) {
			out.println(word);
		}
		
		
		
		
		
		
		

		// second way to create new Word objects and load a Word array (use the split method from the String class)
		//String[] names2 = "freddy at elephant whoooooodat alice tommy bobby it at about".split(" ");
		//Word[] words2 = new Word[10];
		//int j = 0;
		//for (String s : names2) {
			//words2[j] = new Word(s);
			//j++;
		//}

		// Arrays.sort(words);
	}
}