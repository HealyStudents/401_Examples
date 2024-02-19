package loops;

/**
 * This example demonstrates an example of how we may write a loop whose looping condition is based on a String, rather than an integer like many of our previous examples.
 */
public class ShrinkingString 
{

	public static void main(String[] args) 
	{
		String str = "banana";
		while(str.length() > 0)
		{
			System.out.println(str);
			str = str.substring(1);
		}
	}

}
