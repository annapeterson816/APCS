package nestedfors;

import static java.lang.System.*;

import java.util.Scanner;

public class BoxRunner
{
   public static void main( String args[] )
   {{
	   	Scanner keyboard = new Scanner(System.in);
	   	String choice="";
			do{
				out.print("Enter the size of the triangle : ");
				int big = keyboard.nextInt();
					//instantiate a TriangleTwo object
	      Box tw = new Box( big );
				System.out.println( tw );

				System.out.print("Do you want to enter more data? ");
				choice=keyboard.next();
			}while(choice.equals("Y")||choice.equals("y"));
}
	}
}