package io_examples;

import java.util.Scanner;

public class ScannerExamples 
{

	public static void main(String[] args) 
	{
		//Name input
		Scanner keyboard = new Scanner(System.in);
		//Prompt the user to enter their name
		System.out.print("Enter your name: ");
		//Call functions on the scanner object to get input
		String userName = keyboard.nextLine();
		System.out.println("Hello, " + userName + "!");
		
		//Prompt the user to enter their age
		System.out.print("How old are you? ");
		//Call functions on the scanner object to get input
		//int age = keyboard.nextInt();
		int age = Integer.parseInt(keyboard.nextLine());
		System.out.println("You are " + age + " years old");

	}

}
