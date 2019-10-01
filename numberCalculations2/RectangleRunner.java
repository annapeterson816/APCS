package numberCalculations2;


public class RectangleRunner
{
	public static void main( String[] args )
	{
		Rectangle test = new Rectangle();
		test.setLengthWidth(2 , 6 , 3);
		test.calculatePerimeter( );
		test.print();

		test.setLengthWidth(12 , 5 , 10);
		test.calculatePerimeter( );
		test.print();
		

		test.setLengthWidth(20 , 3 , 4);
		test.calculatePerimeter( );
		test.print();
		
		
		
	}
}