package exceptions;

import java.util.Scanner;

public class ExceptionExample 
{
    public static double askNumber()
    {
	Scanner scan = new Scanner(System.in);
	System.out.print("Give me a number: ");
	String in1 = scan.nextLine();
	try 
	{
	    if(in1 != null && in1.length()>0)
	    {
		return Double.parseDouble(in1);
	    }
	    else
	    {
		return 0.0;
	    }
	}
	catch(NumberFormatException e)
	{
	    System.out.println("Not a valid input!");
	    return 0.0;
	}
    }

    public static void main(String[] args) 
    {
	String str = "B";
	try
	{
	    double number = Double.parseDouble(str);
	    System.out.println(number + 2);
	}
	catch(NumberFormatException e)
	{
	    System.out.println("Failed to convert the number!");
	}

	System.out.println(askNumber());
    }
}

