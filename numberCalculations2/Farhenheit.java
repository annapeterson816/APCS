package numberCalculations2;

public class Farhenheit
{
	private double fahren, a, cel;

	public void setFahrenheit(double fahrenheit)
	{
		fahren = fahrenheit;
		
	}

	public double getCelsius()
	{
		 a= fahren - 32;
		 cel = a*(.55555);
		 
		 
		 
		return cel;
	}

	public void print()
	{
		System.out.print(fahren + " degrees Fahrenheit == " );
		System.out.println(String.format("%.2f", cel) + " degrees Celsius");
		
	
	}
}