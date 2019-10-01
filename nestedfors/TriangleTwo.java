package nestedfors;


import static java.lang.System.*;

public class TriangleTwo
{
   private int size;
   private String letter;
   private String output;

	public TriangleTwo()
	{
	}

	public TriangleTwo( String let, int sz)
	{
		letter =let;
		size=sz;
	}

	public void setTriangle(int count, String let)
	{
		String output="";
		for (int i =count; i>=0; i--){
			for (int j= 0; j<= i; i++){
				output = output +letter;
			}
			output = output + "/n";
		}
	}

	public String getLetter()
	{
		return "#";
	}

	public String toString()
	{
		setTriangle(size, letter);
		return output +"\n";
	}
}