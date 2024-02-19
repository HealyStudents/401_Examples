package loops;

/**
 * A demonstration of loop scope problems and how to fix them. The commented-out code does not work because any variable we define *within* a loop no longer exists when the loop is over.
 */
public class LoopScope 
{

	public static void main(String[] args) 
	{
		String str = "hello world!";
		boolean found = false;
		
		int position;
		for (position = 0; !found && position < str.length(); position++)
		{
		   char ch = str.charAt(position);
		   if (ch == ' ') { found = true; }
		}
		
		/*this doesn't work
		for (int position = 0; !found && position < str.length(); position++)
		{
		   char ch = str.charAt(position);
		   if (ch == ' ') { found = true; }
		}
		 *
		 */

		System.out.println(found);
		System.out.println(position - 1); // this throws an Exception

	}

}
