package arraylist;


import static java.lang.System.*;

public class Toy implements Comparable<Toy>
{
	private String name;
	private int count;

	public Toy()
	{
	}

	public Toy( String nm )
	{
		name =nm;
		count=1;
	}
	
	public int getCount()
	{
		return count;
	}
	
	public void setCount( int cnt )
	{
		count=cnt;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName( String nm )
	{
		name=nm;
	}

	public String toString()
	{
	   return "" + name + " " + count;
	}

	public int compareTo(Toy other){
		
		if(this.count > other.count)
		return 1;
		
		if (this.count<other.count)
			return -1;
		
		return this.name.compareTo(other.name);
	}
}