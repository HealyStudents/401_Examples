package array_examples;

/**
 * An example use of an enhanced for loop. Note that enhanced for loops can only be used to *GET* values, not *SET* them.
 */
public class EnhancedFor 
{

	public static void main(String[] args) 
	{
		double[] values = { 23, 43, 67, 6.3, 56 };
		double total = 0;
		for (double element : values) 
		{
			total = total + element;
			element = 5;
		}
		System.out.println(total);
		
		System.out.println(values[0]);

	}

}
