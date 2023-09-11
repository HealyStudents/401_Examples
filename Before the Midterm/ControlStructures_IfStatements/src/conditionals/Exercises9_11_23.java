package conditionals;

import java.util.Scanner;

public class Exercises9_11_23 
{

	public static void main(String[] args) 
	{
		//Exercise 1
		/*
		 * Assume a variable x contains a double value. 
		 * Write an if-else statement that multiplies it by 
		 * itself if the value is greater than 1. 
		 * Otherwise it should divide it by 2.
		 * 
		 */
		
		double x = -4.2;
		if(x > 1)
		{
			x = Math.pow(x, 2);
		}
		else
		{
			x = x / 2;
		}
		
		System.out.println(x);
		
		// Even/odd example
		Scanner scan = new Scanner(System.in);
//		int userNumber = scan.nextInt();
//		
//		if(userNumber % 2 == 0)
//		{
//			System.out.println("Even!!!");
//		}
//		else
//		{
//			System.out.println("Odd!!!!!");
//		}
		
		//alternate (DOES NOT WORK!)
//		if(userNumber % 2 == 1)
//		{
//			System.out.println("Odd!!!!");
//		}
	
//		System.out.print("Name 1: ");
//		String strName1 = scan.nextLine();
//		System.out.print("Name 2: ");
//		String strName2 = scan.nextLine();
//		if (strName1 == strName2){
//			System.out.print("The two strings are equal");
//		}
//		else{
//			System.out.print("The two strings are NOT equal");
//		}
		
//		String a = "bob";
//		String b = "bob";
//		
//		if(a == b)
//			System.out.println("One bob, eternal");
		
		String input = scan.nextLine();
		if (input.equals("Y"))
		{
			System.out.println("Goodbye.");
		}
		
		if (input.equalsIgnoreCase("Y"))
		{
			System.out.println("Goodbye.");
		}
		
		if(input.charAt(0) == 'y')
		{
			System.out.println("Goodbye.");
		}
		
		//If input contains y at all:
		if(input.contains("y"))
		{
			System.out.println("Goodbye.");
		}
		
		if(input.indexOf('y') != -1)
		{
			System.out.println("Goodbye.");
		}

		
		//Suppose x and y are two integers. 
		/* How do you test whether both of them are zero?
		 * (x == 0 && y == 0)
		*  How do you test whether at least one of them is zero?
		*  How do you test whether exactly one of them is zero?
		*  (x==0 && y!=0) || (x!=0 && y==0)
		*/
		
		
	}
	
	public static boolean samePrefix(String strA, String strB)
	{
		if(strA.length() < 3) return false;
		if(strB.length() < 3) return false;
		
//		if(strA.charAt(0) != strB.charAt(0)) return false;
//		if(strA.charAt(1) != strB.charAt(1)) return false;
//		if(strA.charAt(2) != strB.charAt(2)) return false;
		
		String firstThreeA = strA.substring(0,3); // Apple > App
		String firstThreeB = strB.substring(0,3);
		
		return firstThreeA.equals(firstThreeB);
	}


}
