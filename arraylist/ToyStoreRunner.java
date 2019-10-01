package arraylist;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
		ToyStore test= new ToyStore();
		test.loadToys("sorry bat sorry sorry sorry train train teddy teddy ball ball");
		
	
		System.out.println(test);
		test.sortToy();
		System.out.println(test);
		System.out.println(test.getMostFrequentToy());
	
		//test.getThatToy()
		
	}
}