package nestedfors;

import static java.lang.System.*;

public class TriangleFour
{
   private int size;
   private String letter;

	public TriangleFour()
	{
	}

	public TriangleFour(int count, String let)
	{
		size=count;
		letter=let;
	}

	public void setTriangle( String let, int sz )
	{
		letter=let;
		size=sz;
	}

	public String getLetter() 
	{
		return "#";
	}

	public String toString()
	{
		String output="";
		
		for (int i=size; i>0; i-- ){
			for (int k=0; k<size-i; k++){
				output= output + " ";
			}
			
			for (int j=0 ; j<i; j++){
				output = output + letter;
			}
			output = output + "\n";
		}
		return output+"\n";
	}
}
