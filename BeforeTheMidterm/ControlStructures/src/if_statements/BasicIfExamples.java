package if_statements;

public class BasicIfExamples 
{
	public static void main(String[] args)
	{
		/*Assume a variable x 
		 * contains a double value. 
		 * Write an if-else statement 
		 * that multiplies it by itself if the 
		 * value is greater than 1. Otherwise 
		 * it should divide it by 2.*/
		
		double x = 5;
		if(x > 1)
		{
			x *= x;
			// x = x * x;
			// x = Math.pow(x,2);
		}
		else
		{
			x /= 2;
			// x = x / 2;
		}
		
		System.out.println(x);
		
		if (x > 1) 
			x = x * x;
		else 
			x = x / 2;

		
	}
}
