package loops;

/**
 * On line 15, how do we make sure our range is correct and we aren't off by 1?
 */
public class SumOfIntegers 
{

	public static void main(String[] args) 
	{
		// Write a for loop that computes the sum of the integers from 1 to n.
		int n = 10;
		int sum = 0;
		
		for(int x = 1; x <= n; x++) //
		{
			sum += x;
		}
		System.out.println(sum);
	
	}

}
