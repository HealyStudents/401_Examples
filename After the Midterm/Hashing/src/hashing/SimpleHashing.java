package hashing;

import java.util.Scanner;

public class SimpleHashing 
{

	public static void main(String[] args) 
	{
		System.out.print("Give me a string: ");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println(str.hashCode());
		scan.close();
	}

}
