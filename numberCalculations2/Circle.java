package numberCalculations2;


public class Circle
{
	private double rad;
	private double a;
	private double p;

	
	public void setRadius(double radius)
	{
	   rad = radius;
	   
	}

	
	public void setPi(double area , double pi)
	{
		
		p = 22/7;
		
	}
	public void calculateArea( )
	{
		a = (Math.PI)*(rad)*(rad);
	}

	public void print( )
	{
		System.out.printf("The are is :: %.2f \n",a );
		
	}
}