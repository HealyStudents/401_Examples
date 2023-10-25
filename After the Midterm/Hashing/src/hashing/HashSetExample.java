package hashing;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetExample 
{
	
	//Exercise 2. In a loop, ask a user for a string. 
	// Use a HashSet to keep track of each unique string the user has given you.
	public static void getUserInput()
	{
		Scanner scan = new Scanner(System.in);
		HashSet<String> set = new HashSet<String>();
		while(true)
		{
			System.out.print("Give me input: ");
			String in = scan.nextLine();
			set.add(in);
			System.out.println(set);
		}
		//scan.close();
	}
	

	public static void main(String[] args) 
	{
//		HashSet<String> stringSet = new HashSet<String>();
//		stringSet.add("apple");
//		stringSet.add("orange");
//		stringSet.add("apple");
//		System.out.println(stringSet);
		getUserInput();
	}

}
