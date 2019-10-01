package numberCalculations;

import java.util.Scanner;
import java.lang.Math;
public class ChangeMachine {
    
    public static void main(String[] args) {
   	 
   	 Scanner scan = new Scanner(System.in);
   	 
   	 double costOne, amountPaid, owedOne, quarterOne, dimeOne, nickleOne, penniesOne;
   	 int temp;
   	 
   	 
   	 
   	 
   	 //FOR THE SCEEN
   		 System.out.println("Please enter the cost of the item: ");
   		 costOne = scan.nextDouble();
   		 
   		 System.out.println("Please enter the amount paid: ");
   		 amountPaid = scan.nextDouble();
   	 
   		 
   		 //CALCULATIONS
   		 owedOne = (amountPaid - costOne);
   		 owedOne = Math.round(owedOne*100);
   		 owedOne = owedOne / 100;
   		 System.out.println("Change Owed: " + owedOne);
   		 
   		 owedOne = owedOne*100;
   	 
   		 
   		 
   		 quarterOne =(int)(owedOne/25);
   		 System.out.println("Quarters: " + (int) quarterOne);
   		 
   		 dimeOne = ((int)(owedOne) %25/10);
   		 System.out.println("Dimes: " + (int) dimeOne);
   		 
   		 nickleOne= ((int)(owedOne)%25%10/5);
   		 System.out.println("Nickles: " + (int) nickleOne);
   		 
   		 penniesOne = ((int)(owedOne)%25%10%5);
   		 System.out.println("Pennies: " + (int) penniesOne);
    }}
