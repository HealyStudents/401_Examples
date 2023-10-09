package review;

public class CompileTimeVsRuntime 
{

	public static void main(String[] args) 
	{
		//Compile time example:
		//Missing a semicolon
		//System.out.println("Hello!")
		//Calling an object-oriented method in a static way
		//Bus.moveToNextStop();
		
		//Dividing by 0
		int a = 0;
		int b = 10;
		//System.out.println(b/a); //arithmetic exception
		
		//Index out of bounds exception
		String hello = "hi";
		//System.out.println(hello.charAt(2));
		
		//Number Format Exception
		String numString = "the number 120";
		//int i = Integer.parseInt(numString);
	}

}
