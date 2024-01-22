package if_statements;

import java.util.Scanner;

public class CheckY 
{

	public static void main(String[] args) 
	{
		//Supply a condition in this if statement to test whether the user entered a Y:
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			//System.out.println("Input: \"" + input + "\"");
			String y = "y";
			
			//checking if equals y
//			if (input.equals(y)){
//				System.out.println("Goodbye.");
//			}
			
			//check if starts with y
//			if (y.equals( "" + input.charAt(0))){
//				System.out.println("Goodbye.");
//			}
			//check if starts with y
//			if (input.charAt(0) == 'y'){
//				System.out.println("Goodbye.");
//			}
			
			//check if starts with y (ignoring case)
//			if (input.charAt(0) == 'y' || input.charAt(0) == 'Y'){
//				System.out.println("Goodbye.");
//			}
			
			if (input.toLowerCase().charAt(0) == 'y'){
				System.out.println("Goodbye.");
			}
			
	}
}
