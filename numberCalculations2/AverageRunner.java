package numberCalculations2;

public class AverageRunner
{
	public static void main( String[] args )
   {
 		Average test=new Average();
 		test.setNums(5,5);
 		test.average();
 		test.print();
 		
 		Average test2=new Average();
 		test.setNums(5,5);
 		test.average();
 		test.print();
 		
 		Average test3=new Average();
 		test.setNums(90,100.0);
 		test.average();
 		test.print();
 		
 		Average test4=new Average();
 		test.setNums(100,85.8);
 		test.average();
 		test.print();
 		
 		Average test5=new Average();
 		test.setNums(-100,55);
 		test.average();
 		test.print();
 		
 		Average test6=new Average();
 		test.setNums(15236,5642);
 		test.average();
 		test.print();
 		
 		Average test7=new Average();
 		test.setNums(1000,555);
 		test.average();
 		test.print();
	}
}
