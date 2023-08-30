package variables;

import java.util.Scanner;

public class AdditionCalculator 
{

	public static void main(String[] args) 
	{
		/* Create a simple addition calculator program that 
		 * asks the user for two numbers, adds them, 
		 * and prints that sum.
		*/
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is your first number? ");
		double firstNumber = Double.parseDouble(input.nextLine());
		
		System.out.println("What is your second number? ");
		double secondNumber = Double.parseDouble(input.nextLine());
		
		double sum = firstNumber + secondNumber;
		System.out.println("Sum: " + sum);
		System.out.println("Sum: " + (firstNumber + secondNumber));

	}

}
