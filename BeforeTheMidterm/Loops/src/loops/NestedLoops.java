package loops;

/**
 * Two examples of nested for loops. Just by looking at the second example, can you confidently say what the output will be?
 */
public class NestedLoops 
{

	public static void main(String[] args) 
	{
		for(int i=1;i<4;i++)
		{
			for(int j=1;j<4;j++)
			{
				System.out.println(i+" x "+j+" = "+(i*j));
			}
		}
		
		/*
		 * i, j, output
		 * 1, 1, "1 x 1 = 1"
		 * 1, 2, "1 x 2 = 2"
		 * 1, 3, "1 x 3 = 3"
		 * 2, 1, "2 x 1 = 2"
		 * 2, 2, "2 x 2 = 4"
		 * 2, 3, "2 x 3 = 6"
		 * 3, 1, "3 x 1 = 3"
		 * 3, 2, "3 x 2 = 6"
		 * 3, 3, "3 x 3 = 9" 
		 */
		
		//Second example
		String word = "Computer Science";
		for(int i=0; i<word.length(); i++)
		{
			for(int j=0; j<i; j++)
			{
				System.out.print(" ");
			}
			System.out.println(word.charAt(i));
		}
	}

}
