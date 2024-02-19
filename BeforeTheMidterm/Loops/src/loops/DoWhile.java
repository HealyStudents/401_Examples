package loops;

/**
 * This example is meant to help illustrate the very small differences between a while and do-while loop. Try changing around the initial values of i to see if behavior changes!
 * 
 * One is meant to parse from this example that do-while loops have exactly the same behavior as while loops UNLESS the looping condition is initially false, in which case do-while loops will still execute at least once, but while loops will not.
 */
public class DoWhile 
{

	public static void main(String[] args) 
	{
		System.out.println("Version 1:");
		int i = 1000;
		while(i < 1000)
		{
			System.out.println(2*i+1);
			i++;
		}
		
		System.out.println("Version 2:");
		//The same thing with a do-while
		i = 1000;
		do
		{
			System.out.println(2*i+1);
			i++;
		}
		while(i < 1000);
	}

}
