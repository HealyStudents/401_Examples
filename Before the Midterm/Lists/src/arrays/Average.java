package arrays;

public class Average 
{

	public static void main(String[] args) 
	{
		int[] scores = {10, 9, 7, 10, 5, 20, 74};
		double total = 0;
		for(int i = 0; i < scores.length; i++)
		{
		    total += scores[i];
		}
		double average = total / scores.length;
		int intAverage = (int)(average * 100);
		average = intAverage/100.0;
		
		System.out.println("Average: " + average);
		System.out.println("Sum " + total);
	}

}
