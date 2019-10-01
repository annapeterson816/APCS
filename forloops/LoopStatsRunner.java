package forloops;

import static java.lang.System.*;

public class LoopStatsRunner
{
	public static void main ( String[] args )
	{
		LoopStats test = new LoopStats();
		test.setNums(1, 5);
		out.println(test);
		System.out.println("total:: " + test.getTotal());
		System.out.println("even count:: " + test.getEvenCount());
		System.out.println("odd count:: " + test.getOddCount());
		
		
		
		
	}
}