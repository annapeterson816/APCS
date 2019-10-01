package numberCalculations2;

public class LineRunner {

	public static void main( String[] args )
	   {
		Line test = new Line ();
		test.setCoordinates( 1, 9, 14, 2);
		test.calculateSlope();
		test.print();		
			
		Line test2 = new Line ();
		test.setCoordinates( 1, 7, 18, 3);
		test.calculateSlope();
		test.print();		
			
		Line test3 = new Line ();
		test.setCoordinates( 6, 4, 2, 2);
		test.calculateSlope();
		test.print();		
		
		Line test4 = new Line ();
		test.setCoordinates( 4, 4, 5, 3);
		test.calculateSlope();
		test.print();		
			
		Line test5 = new Line ();
		test.setCoordinates( 1, 1, 2, 9);
		test.calculateSlope();
		test.print();		
			
		}
	}