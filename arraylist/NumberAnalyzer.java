package arraylist;


import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;

public class NumberAnalyzer
{
	private ArrayList<Number> list;

	public NumberAnalyzer()
	{
		list = new ArrayList<Number>();
	}

	public NumberAnalyzer(String numbers)
	{
		list = new ArrayList<Number>();
		setList(numbers);

	}
	
	public void setList(String numbers)
	{
		Scanner scan = new Scanner(numbers);
		
		while (scan.hasNext()){
			list.add(new Number(scan.nextInt()));
		}
	}

	public int countOdds()
	{
      int oddCount=0;
      	for( Number num : list){
      		if (num.isOdd()==true)
    		  oddCount++;
      }


      return oddCount;
	}

	public int countEvens()
	{
      int evenCount=0;
  	for( Number num : list){
  		if (num.isOdd()==false)
		 evenCount++;
  	}


      return evenCount;
	}

	public int countPerfects()
	{
		int perfectCount=0;
		for( Number num : list){
	  		if (num.isPerfect()==true)
			 perfectCount++;
		}
      return perfectCount;
	}
	
	public String toString( )
	{
		return "" + list;
	}
}