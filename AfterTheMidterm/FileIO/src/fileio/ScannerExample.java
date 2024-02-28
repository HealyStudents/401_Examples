package fileio;

import java.util.Scanner;

public class ScannerExample 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner("Hello there!\nFoo\nBar\nFooBar\n");
		
		System.out.println(scan.nextLine());
		
		System.out.println(scan.nextLine());
		
		scan.nextLine();
		
		System.out.println(scan.nextLine());
	}

}
