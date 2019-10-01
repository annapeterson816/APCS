package nestedfors;

import static java.lang.System.*;

import java.util.Scanner;

public class TriangleThreeRunner
{
   public static void main( String args[] )
  
	   {
	   	Scanner keyboard = new Scanner(System.in);
	   	String choice="";
			do{
				out.print("Enter the size of the triangle : ");
				int big = keyboard.nextInt();
				out.print("Enter a letter : ");
				String value = keyboard.next();

					//instantiate a TriangleTwo object
	      TriangleThree tw = new TriangleThree( big, value );
				System.out.println( tw );

				System.out.print("Do you want to enter more data? ");
				choice=keyboard.next();
			}while(choice.equals("Y")||choice.equals("y"));
		}
	
   }
