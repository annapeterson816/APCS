package nestedfors;

import static java.lang.System.*;

import java.util.Scanner;

public class BoxWordRunner
{
   public static void main( String args[] )
   {
	   	Scanner keyboard = new Scanner(System.in);
	   	String choice="";
			do{
				
				out.print("Enter the word : ");
				String value = keyboard.next();

					//instantiate a TriangleTwo object
	      BoxWord tw = new BoxWord( value );
				System.out.println( tw );

				System.out.print("Do you want to enter more data? ");
				choice=keyboard.next();
			}while(choice.equals("Y")||choice.equals("y"));
}
}