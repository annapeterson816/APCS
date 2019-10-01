package ifelse;


import static java.lang.System.*; 
import java.util.Scanner;

public class GradeCheck
{
	public static void main( String args[] )
	{
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Enter a number grade :: ");
		int	IntOne = scan.nextInt();
		
		Grade test = new Grade();
			test.setGrade(IntOne);
			test.getLetterGrade();
		   out.println(test);
	
		
		
	}
	
}
