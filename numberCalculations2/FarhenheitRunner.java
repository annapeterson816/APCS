package numberCalculations2;

public class FarhenheitRunner {

	public static void main( String[] args )
		{
			Farhenheit test = new Farhenheit ();
			test.setFahrenheit(98.6);
			test.getCelsius();
			test.print();
			
			Farhenheit test1 = new Farhenheit ();
			test.setFahrenheit(52.30);
			test.getCelsius();
			test.print();
			
			Farhenheit test2 = new Farhenheit ();
			test.setFahrenheit(82.45);
			test.getCelsius();
			test.print();
					
			Farhenheit test3 = new Farhenheit ();
			test.setFahrenheit(75.00);
			test.getCelsius();
			test.print();
			
			Farhenheit test4 = new Farhenheit ();
			test.setFahrenheit(100.00);
			test.getCelsius();
			test.print();
		}
	}