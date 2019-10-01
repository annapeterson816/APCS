package ifelse;


import static java.lang.System.*;

public class WordFunRunner
{
	public static void main( String args[] )
	{
	   WordFun test = new WordFun("Hello World");
	   test.addHyphen();
	   out.println(test);
	   
	   WordFun test2 = new WordFun("Jim Bob");
	   test2.addHyphen();
	   out.println(test2);
	   
	   WordFun test3 = new WordFun("Computer Science");
	   test3.addHyphen();
	   out.println(test3);
	   
	   WordFun test4 = new WordFun("UIL TCEA");
	   test4.addHyphen();
	   out.println(test4);
	   
	   WordFun test5 = new WordFun("State Champions");
	   test5.addHyphen();
	   out.println(test5);
	   
	  

	  

	}
}