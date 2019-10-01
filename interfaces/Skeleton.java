package interfaces;

import static java.lang.System.*; 



public class Skeleton implements Monster
{
	private String word;
	private int size;
	
	public Skeleton(String s, int sz){
		word=s;
		size=sz;
	}

	public int getHowBig(){
		return size;
		
	}
	
	public String getName(){
		
		return word;
	}
	

	public boolean isBigger(Monster other){
		if(this.getHowBig() > other.getHowBig()) 
			return true;
		return false;
		
	}
	public boolean isSmaller(Monster other){
		if (this.getHowBig() < other.getHowBig())
			return true;
		return false;
	}
	
	
	
	public boolean namesTheSame(Monster other){
		if (this.getHowBig() == other.getHowBig())
			return true;
		return false; 
	}


	//add a toString
	public String toString(){
		return word;
	}
}