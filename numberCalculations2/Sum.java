package numberCalculations2;

public class Sum
{
	//instance variables
	private double one, two, sum;

	public void setNums(double num1, double num2)
	{
		
		one = num1;
		two = num2;
	}

	public void sum( )
	{
		sum = one + two;
	}

	public void print( )
	{
		
		System.out.print(one + " + " + two +" == " );
		System.out.println(String.format("%.2f \n " , sum));
	}
}

