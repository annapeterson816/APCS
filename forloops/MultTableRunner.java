package forloops;

import static java.lang.System.*;

public class MultTableRunner
{
	public static void main ( String[] args )
	{
		MultTable test = new MultTable();
		test.setTable(5,5); 
		test.printTable();
		
		test.setTable(3, 7);
		test.printTable();
		
		test.setTable(1, 6);
		test.printTable();
		
		test.setTable(9, 9);
		test.printTable();
		
		test.setTable(7, 8);
		test.printTable();
		
		
	}
}
