package numberCalculations;

import java.util.Scanner;

public class CollegeCalculator {

    public static void main(String[] args) {
   	 
   	 Scanner scan = new Scanner(System.in);
   	 
   	 double furnitureOne, tuitionOne, roomOne, booksOne, foodOne, scholarshipOne, finacialOne, exspenseOne, offsetOne, totalCost;
   	 
   	 //EXPENSES
   	 
   	 System.out.println("Please enter the following amount you will be spending on each expense below.");
   	 
   	 System.out.println("Furniture: ");
   		 furnitureOne = scan.nextDouble();
   		 
   		 System.out.println("Tuition: ");
   		 tuitionOne = scan.nextDouble();
   		 
   		 System.out.println("Room and Board: ");
   		 roomOne = scan.nextDouble();
   		 
   		 System.out.println("Books: ");
   		 booksOne = scan.nextDouble();
   	 
   		 System.out.println("Food: ");
   		 foodOne = scan.nextDouble();
   	 
   	 //OFFSET COSTS
   		 
   		 System.out.println("Please enter the following amount you will be recieving in offset costs.");
   		 
   		 System.out.println("Scholarships: ");
   		 scholarshipOne = scan.nextDouble();
    
   		 System.out.println("Finacial Aid: ");
   		 finacialOne = scan.nextDouble();
   		 
   		 
   	 //CALCULATIONS
   	 exspenseOne = furnitureOne + tuitionOne + roomOne + booksOne + foodOne;
   	 offsetOne = scholarshipOne + finacialOne;
   	 totalCost = exspenseOne - offsetOne;
   	 
   	 System.out.println("Your total expenses are: $" + exspenseOne);
   	 System.out.println("Your total offset costs are: $" + offsetOne);
   	 System.out.println(" ");
   	 System.out.println("Your total cost for college is: $" + totalCost);
   		 
   		 
   		 
    }

}
