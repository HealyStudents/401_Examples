package if_statements;

/**
 * This code demonstrates the importance of using the .equals method when comparing Strings.
 */
public class EqualStrings 
{

	public static void main(String[] args) 
	{
		String a = "apple";
		String b = "apple";
		
		//Using double-equals sign compares the reference (i.e. are a and b the *same object*)
		if(a == b)
		{
			System.out.println("They have the same reference!");
		}
		else
		{
			System.out.println("They do NOT have the same reference!");
		}
		
		//.equals compares the values of these objects -- do a and b contain the same characters?
		if(a.equals(b))
		{
			System.out.println("They are equal!");
		}
		else
		{
			System.out.println("They are not equal!");
		}
	}

}
