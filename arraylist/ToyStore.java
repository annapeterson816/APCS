package arraylist;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		
		
		toyList = new ArrayList<Toy>();
		
	}

	public void loadToys( String toys )
	{
		Scanner scan = new Scanner(toys);
		while(scan.hasNext()){
			String nextToy = scan.next();
		
		Toy toyInList = getThatToy(nextToy);
		if (toyInList ==null){
			toyList.add(new Toy(nextToy));
		}
		else {
			toyInList.setCount(toyInList.getCount() +1);
		}
		}
		
		
	}
  
  public Toy getThatToy( String nm )
  {
	  for (Toy goodToy : toyList){
		  if (goodToy.getName().equals(nm)){
			  return goodToy;
		  }
	  }
  	return null;
  }
  
  public String getMostFrequentToy()
  {
	 Toy mostFrequent = new Toy();
	  for(Toy AwesomeToy: toyList){
		  
		if(AwesomeToy.getCount() >  mostFrequent.getCount()){
			mostFrequent= AwesomeToy;
		}
	  }
  	return "max == " + mostFrequent;
  }  
    
  	  public void sortToy(){
  		  Collections.sort(toyList);
  	  }
	public String toString()
	{
	   return "" + toyList;
	}
}