package forloops;


import static java.lang.System.*;

public class MultTable
{
	private int number;
	private int stop;

	public MultTable()
	{
		number=stop=0;
	}

	public MultTable(int num, int end)
	{
		number=num;
		stop=end;
		
	}

	public void setTable(int num, int end)
	{
		number=num;
		stop=end;
		
	}

	public void printTable( )
	{
		System.out.println( "\n \n" + "multiplication table for " + number );
		for ( int i = 1 ; i <+ stop ; i++){
		
		 
		
		System.out.println(i +  "\t" + i*number);
		
		}
		
	}
}
