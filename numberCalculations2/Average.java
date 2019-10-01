package numberCalculations2;


public class Average
{
	
	private double one, two, average, sum;

	public void setNums(double num1, double num2)
	{
		one=num1;
		two=num2;
		
	}

	public void average( )
	{
		sum = one + two;
		average = sum/2;

	}
	public void print( )
	{
		System.out.print(one + " + " + two + " has an average of " + String.format("%.2f \n" ,average));
	}
}
