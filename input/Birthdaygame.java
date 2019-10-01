package input;

import java.util.Scanner;

public class Birthdaygame {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		int intOne=0; 
		int intTwo=0;
		int answer=0;
		int banswer=0;

		System.out.println("Use paper and pencil, perform the following calculations");
		System.out.println("");
		System.out.println("1. Determine your birth month (Jaunary=1. February=2 and so on).");
		System.out.println("2. Multiply that number by 5");
		System.out.println("3. Add 6 to that number.");
		System.out.println("4. Multiply the number by 4.");
		System.out.println("5. Add 9 to the number.");
		System.out.println("6. Multiply that number by 5.");
		System.out.println("7. Add your birth day to the number (10 if the 10th and so on)");
		System.out.println("");
		System.out.println("Enter your number: " );
			answer = scan.nextInt();
			banswer = (answer-165);
			
			
			intOne = banswer / 100;
			
			intTwo = banswer % 100;
		
			
			
		System.out.println("Your birthday is: " + intOne + "/" + intTwo);
			
		
		
	}

}
