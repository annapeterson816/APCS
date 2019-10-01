package numberCalculations2;


public class Cube
{
	private int s;
	private int sa;

	public void setSide(int side )
	{
		s = side;
	}
	
	public void setSa(int surfaceArea)
	{
		sa= surfaceArea;
	}
	public void calculateSurfaceArea( )
	{
		
		sa=(6*s*s);
	}

	public void print( )
	{
		System.out.print("The surface are is :: " + sa + " \n");
	}
}