package ifs;


import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer
{
	private char theChar;

	public CharacterAnalyzer()
	{
	}

	public CharacterAnalyzer(char c)
	{
		theChar=c;
	}

	public void setChar(char c)
	{
		theChar = c;
	}

	public char getChar()
	{
		return theChar;
	}

	public boolean isUpper( )
	{
		if (theChar > 64 && theChar < 91) {
		
		return true;}
		
		else return false;
	}

	public boolean isLower( )
	{
		if (theChar > 96 && theChar < 123 ) {
		return true;}
		
		return false;
	}
	
	public boolean isNumber( )
	{
		if (theChar > 47 && theChar < 58) {
			return true;}
		return false;
	}	

	public int getASCII( )
	{
		return (int)theChar ;
	}

	public String toString()
	{
		if (isUpper() == true){
		return ""+getChar() + " is an uppercase character. ASCII == " + getASCII() + "\n";}	
		
		if (isLower() == true){
			return ""+getChar() + " is a lowercase character. ASCII == " + getASCII() + "\n";}	
		
		if (isNumber() == true){
			return ""+getChar() + " is a number. ASCII == " + getASCII() + "\n";}
		
		return "yes";
	}
}