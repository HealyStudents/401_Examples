package if_statements;

public class EqualStrings 
{

	public static void main(String[] args) 
	{
		String a = "apple";
		String b = "apple";
		
		if(a == b)
		{
			System.out.println("They have the same reference!");
		}
		else
		{
			System.out.println("They do NOT have the same reference!");
		}
		
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
