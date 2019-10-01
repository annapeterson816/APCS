package arrays;

import java.lang.System;
import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;

public class Grades
{
	//add a double[] array instance variable
	private double [] dArray;
	double sum=0;
	double average=0;
	private Scanner scan;
	

	//constructors
	public Grades(){
		
	}
	public Grades (String s, int num){
		dArray=new double[num];
		int spot=0;
		scan = new Scanner(s);
		while (scan.hasNext()){
			dArray[spot]= scan.nextDouble();
			spot++;
		}
	}
	
	public double getSum(){
		
		for (int i=0; i<dArray.length; i++){
			sum = sum +(dArray[i]);
		}
		return sum;
	}
	
	
	public double getAverage(){
		
		
			average=getSum()/dArray.length;
		return average;
	}
	
	public String toString(){
		String string1 = "grade :: " ;
		for (int i=0; i<dArray.length; i++){
			string1= string1 + dArray[i] + "\n";
		}
		
		String string2 = " average :: ";
			string2= string2 + getAverage();

		return string1 + string2;
			
		
		
	}

}
