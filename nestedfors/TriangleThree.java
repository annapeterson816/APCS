package nestedfors;

import static java.lang.System.*;

public class TriangleThree
{
   private int size;
   private String letter;

	public TriangleThree()
	{
	}

	public TriangleThree(int count, String let)
	{
		size=count;
		letter=let;
	}

	public void setTriangle( String let, int sz )
	{
		size=sz;
		letter=let;
	}

	public String getLetter() 
	{
		return "#";
	}

	public String toString()
	{
		String output="";
		for (int i=size; i>=0; i-- ){
			for (int j=0 ; j<=i; j++){
				output = output + " ";
			}
			for (int k=0; k<=size-i; k++){
				output= output + letter;
			}
			output = output + "\n";
		}
		return output+"\n";
	}
}
