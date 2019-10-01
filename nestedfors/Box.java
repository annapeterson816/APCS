package nestedfors;


import static java.lang.System.*;

public class Box
{
   private int size;

	public Box()
	{
	}

	public Box(int count)
	{
		size=count;
	}

	public void setSize(int count)
	{
		size=count;
	}

	

	public String toString()
	{
		String output="";
		for (int i=size; i>0; i-- ){
			for (int j=0 ; j<i; j++){
				output = output + "*";
			}
			for (int k=0; k<=size-i; k++){
				output= output + "#";
			}
			output = output + "\n";
		}
		return output+"\n";
	}
}