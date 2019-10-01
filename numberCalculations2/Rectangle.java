package numberCalculations2;


public class Rectangle
{
	private double L;
	private double W;
	private double P;

	public void setLengthWidth(double length, double width, double perimeter )
	{
		L = length;
		W = width;
		P = perimeter;
	}

	public void calculatePerimeter( )
	{
		P = 2*L + 2*W;
	}

	public void print( )
	{
		System.out.print("The perimeter is " + ":: " + P + "\n " );
		
	}
}
