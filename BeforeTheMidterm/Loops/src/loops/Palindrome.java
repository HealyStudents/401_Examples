package loops;

import java.util.Scanner;

/**
 * This class takes advantage of a couple String methods we've gone over before to simplify the operation of checking if a String is a pallindrome.
 */
public class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a phrase: ");
		String phrase = sc.nextLine();
		if(isPalindrome(phrase)) System.out.println("It is palindrome");
		else System.out.println("It is not palindrome");
	}
	
	/**
	 * A method that uses our filterSymbols and invert methods to simplify the operation of checking if something is a Palindrome.
	 * 
	 * @param s some String.
	 * @return true if s is a palindrome, false otherwise.
	 */
	public static boolean isPalindrome(String s)
	{
		if(s==null) return false;
		s = s.toUpperCase();
		s = filterSymbols(s);
		String i = invert(s);
		return i.equals(s);
	}
	
	/**
	 * This method demonstrates an alternative method of filtering out non-letter characters without using ASCII values.
	 * @param s Some string.
	 * @return A new string that has all of the characters in s that are letters.
	 */
	public static String filterSymbols(String s)
	{
		String validCharacters = "abcdefghijklmnopqrstuvwxyzABCDEFGHYJKLMNOPQRSTUVWXYZ";
		if(s == null) return null;
		String filtered = "";
		for(int i=0;i<s.length();i++){
			if(validCharacters.indexOf(s.charAt(i)) != -1 ){
				filtered += s.charAt(i);
			}
		}
		return filtered;
	}
	
	/**
	 * A method that inverts a String (i.e. reverses its order of characters)
	 * @param s Some string.
	 * @return A new String with all the characters of s in reverse order.
	 */
	public static String invert(String s)
	{
		if(s == null) return null;
		String inverted = "";	
		for(int i=0;i<s.length();i++){
			inverted = s.charAt(i) + inverted;
		}
		return inverted;
	}
}

