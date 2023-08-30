package variables;

import java.util.Scanner;

public class CentConverter 
{

	public static void main(String[] args) 
	{
		// Write a program to determine the 
		// value in dollars and cents of 1729 pennies.
		int pennies = 1729;
		
		int dollars = pennies / 100;
		int cents = pennies % 100;
		
		System.out.println("$" + dollars + "." + cents);
		
		double total = pennies / 100.0;
		System.out.println("$" + total);
		
		String city = "Pittsburgh";
		String cityCharacter =  "" + city.charAt(0);
		System.out.println(cityCharacter);
		
		String jp = "Java Program";
		int len = jp.length();
		len = "Java Program".length();
		
		//Make an object that can read input from the console
		Scanner keyboard = new Scanner(System.in);
//		//Prompt the user to enter their name
//		System.out.print("Enter your name: ");
//		//Call functions on the scanner object to get input
//		String userName = keyboard.nextLine();
//		
//		System.out.println("Your name is " + userName);
//		
//		keyboard.close();
		
		String myString = "745";
		int myInteger = Integer.parseInt(myString);
		
		System.out.print("How old is your dog? ");
		//int age = keyboard.nextInt();
		String userDogInput = keyboard.nextLine();
		userDogInput = userDogInput.trim();
		int age = Integer.parseInt(userDogInput);
		
		int dogYears = 7 * age;
		System.out.println("That dog is " + dogYears + " dog years old.");
		
		
	}

}
