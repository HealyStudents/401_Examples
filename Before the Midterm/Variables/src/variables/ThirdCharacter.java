package variables;

import java.util.Scanner;

public class ThirdCharacter 
{

	public static void main(String[] args) 
	{
		/*
		Create a program that asks the user for 
		a word and then prints out the 3rd character 
		from the end of that word
		*/
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Give me a word!");
		String word = keyboard.nextLine();
		
		int characterIndex = word.length() - 3;
		System.out.println("Magic character: " + word.charAt(characterIndex));
		
		
		
		/*
		Create a program that asks the user 
		for two numbers (doubles) and returns the 
		integer-division quotient and integer remainder 
		of dividing the first by the second.
		*/
	}

}
