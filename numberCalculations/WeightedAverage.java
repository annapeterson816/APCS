package numberCalculations;

import java.util.Scanner;

public class WeightedAverage {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double testOne, testTwo, quizOne, quizTwo, quizThree, homeworkOne, testAvg, quizAvg, finalAvg;
		
		
		//TESTS
		System.out.println("Please enter your test grades.");
		System.out.println("Test 1: ");
		testOne = scan.nextDouble();
		
		System.out.println("Test 2: ");
		testTwo = scan.nextDouble();
		

		//QUIZ
		System.out.println("Please enter your quiz grades.");
		System.out.println("Quiz 1: ");
		quizOne = scan.nextDouble();
		
		System.out.println("Quiz 2: ");
		quizTwo = scan.nextDouble();
		
		System.out.println("Quiz 3: ");
		quizThree = scan.nextDouble();
		
		//HOMEWORK
		System.out.println("Please enter your homework average.");
		System.out.println("Homework: ");
		homeworkOne = scan.nextDouble();
		
		
		//CALCULATIONS
		testAvg = (testOne + testTwo) /2;
		quizAvg = (quizOne + quizTwo + quizThree) /3;
		finalAvg = (testAvg*.5) + (quizAvg*.3) + (homeworkOne*.2);
		
		
		//TOTAL
		System.out.println("Test Average: " + testAvg);
		System.out.println("Quiz Average: " + quizAvg);
		System.out.println("Final Grade: "+ finalAvg);
		
		

	}

}
