package loops;

import java.util.Scanner;

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
	
	public static boolean isPalindrome(String s)
	{
		if(s==null) return false;
		s = s.toUpperCase();
		s = filterSymbols(s);
		String i = invert(s);
		return i.equals(s);
	}
	
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

