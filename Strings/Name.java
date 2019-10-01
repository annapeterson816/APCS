package Strings;


import static java.lang.System.*;

public class Name
{
	private String name;
	private int x, y;

	public Name()
	{
	}

	public Name(String s)
	{
		name=s;
	}

   public void setName(String s)
   {
	   name=s;
   }

	public String getFirst()
	{
		
		x= name.indexOf(" ");
		return name.substring(0, x);
	}

	public String getLast()
	{
		x= name.indexOf(" ");
		return name.substring(x +1);
	}

 	public String toString()
 	{
 		return name + "\n";
	}
}