package array_examples;

public class AverageCalculation 
{

	public static void main(String[] args) 
	{
		/*
		 * Starting from the above code as an example, 
		 * write a piece of code that computes the average 
		 * and the sum of the array scores.
		 */
		int sum = 0;
		int[] scores = { 10, 9, 7, 10, 5, 20, 74 };
		for(int i = 0; i < scores.length; i++)
		{
			sum += scores[i];
		}
		
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + ((double)sum / scores.length));
	}
}
