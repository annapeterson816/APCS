package Strings;

import static java.lang.System.*;

public class AddRunner
{
	public static void main ( String[] args )
	{
		AddStrings demo = new AddStrings("hello","world");
		demo.add();
		out.println(demo);

		demo.setStrings("jim","bob");
		demo.add();
		out.println(demo);

		demo.setStrings("sally", "sue");
		demo.add();
		out.println(demo);
		
		demo.setStrings("computer", "science");
		demo.add();
		out.println(demo);
		
		demo.setStrings("uil", "contests");
		demo.add();
		out.println(demo);
	}
}
