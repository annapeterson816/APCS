package forloops;

import static java.lang.System.*; 
public class CountPairsRunner
{
	public static void main( String[] args )
	{
		
		
		System.out.println(CountPairs.pairCounter("ddogccatppig"));
		System.out.println(CountPairs.pairCounter("dogcatpig"));
		System.out.println(CountPairs.pairCounter("xxyyzz"));
		System.out.println(CountPairs.pairCounter("a"));
		System.out.println(CountPairs.pairCounter("abcdo"));
		System.out.println(CountPairs.pairCounter("aabb"));
		System.out.println(CountPairs.pairCounter("dogcatpigaabbcc"));
		System.out.println(CountPairs.pairCounter("aabbccdogcatpig"));
		System.out.println(CountPairs.pairCounter("dogabbcccatpig"));
		System.out.println(CountPairs.pairCounter("aaaa"));
		System.out.println(CountPairs.pairCounter("AAAAAAAAA"));
			
	}
}
