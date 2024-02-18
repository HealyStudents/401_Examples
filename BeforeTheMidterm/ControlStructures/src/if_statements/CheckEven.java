package if_statements;

import java.util.Scanner;

/**
 * This demonstrates how to write a simple if statement to check if a number is even, using modulo.
 */
public class CheckEven 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Give me a number: ");
		int x = keyboard.nextInt();
		// x = Integer.parseInt(keyboard.nextLine());
		
		//if x is even
		if(x % 2 == 0)
		{
			//say it's even
			System.out.println("Even!");
		}
		else
		{
			//say it's odd
			System.out.println("Odd!");
		}
		
		//if x is odd (this doesn't work)
//		if(x % 2 == 1)
//		{
//			System.out.println("Odd!");
//		}
//		else
//		{
//			System.out.println("Even!");
//		}
	}

}
