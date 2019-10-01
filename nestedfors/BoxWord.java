package nestedfors;

import static java.lang.System.*;

class BoxWord
{
   private String word;

	public BoxWord()
	{
		word="";
	}

	public BoxWord(String s)
	{
		word = s; 
	}

	public void setWord(String w)
	{
		word =w;
	}

	public String getBackWards()
	{
		String back="";
		
		for (int i = word.length()-1; i>= 0; i--)
		{
			back += Character.toString(word.charAt(i));
		}
		return back;
	}
	
	public String toString()
	{
		String output="";
		output = output + word + "\n";
		for (int i =1; i<word.length()-1; i++) {
			output = output + word.charAt(i);
			for(int j = 2; j< word.length(); j++)
				output = output+" ";
			for(int x=i; x < i + 1; x++)
				output = output + getBackWards().charAt(x);
			output = output + "\n";
		}
		output = output + getBackWards();
		
		return output+"\n";
	}
}