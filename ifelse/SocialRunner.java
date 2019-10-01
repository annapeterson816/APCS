package ifelse;

import static java.lang.System.*;


import static java.lang.System.*;

public class SocialRunner
{
	public static void main( String args[] )
	{
		Social test= new Social("456-56-234");
		test.chopAndAdd();
		System.out.print(test);
		
		Social test2= new Social("1-1-1");
		test2.chopAndAdd();
		System.out.print(test2);
		
		Social test3= new Social("102-2-12");
		test3.chopAndAdd();
		System.out.print(test3);
		
		Social test4= new Social("0-0-0");
		test4.chopAndAdd();
		System.out.print(test4);
		
		
	
		
		
		
	}
}