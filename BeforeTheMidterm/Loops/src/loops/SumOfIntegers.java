package loops;

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
