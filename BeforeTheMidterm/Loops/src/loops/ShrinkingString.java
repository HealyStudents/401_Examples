package loops;

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
