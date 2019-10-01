package forloops;

import static java.lang.System.*;

public class VowelCounterRunner
{
	public static void main ( String[] args )
	{
		
		
		
		System.out.println( VowelCounter.vowel("abcdef") );
		System.out.println( VowelCounter.vowel("hhhhhhh") );
		System.out.println( VowelCounter.vowel("aaaaaaa") );		
		System.out.println( VowelCounter.vowel("catpigdatrathogbogfrogmoosegeese") );
		System.out.println( VowelCounter.vowel("hhhhhhh1234356HHHHDH") );
		System.out.println( VowelCounter.vowel("AEIOUaeiou87878alkjdaslwlejrlajflawjkflwj") );
		System.out.println( VowelCounter.vowel("") );
		System.out.println( VowelCounter.vowel("x") );
		System.out.println( VowelCounter.vowel("e") );
		
	}
}