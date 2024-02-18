package if_statements;

import java.util.Scanner;

/**
 * An example of getting String input from the user and a comparison between those inputs.
 */
public class StringInputs 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Name 1: ");
		String strName1 = scanner.nextLine();
		System.out.print("Name 2: ");
		String strName2 = scanner.nextLine();
		
		if (strName1.equals(strName2)){
			System.out.print("The two strings are equal");
		}
		else{
			System.out.print("The two strings are NOT equal");
		}

	}

}
