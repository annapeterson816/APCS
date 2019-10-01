package numberCalculations2;

public class Line {

		private double x1,y1, x2, y2, top, bottom;
		private double m;

		
		public void setCoordinates(int xOne, int yOne, int xTwo, int yTwo)
		{

			x1 = xOne;
			y1 = yOne;
			x2 = xTwo;
			y2 = yTwo;



		}

		public void calculateSlope( )
		{
			
			top = (y2-y1);
			bottom = (x2 - x1);
			 
			m= top / bottom;
			



		}

		public void print( )
		{
			
			System.out.printf("The slope is %.2f \n " , m);

		}
	}
