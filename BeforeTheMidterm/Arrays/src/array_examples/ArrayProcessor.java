package array_examples;

public class ArrayProcessor 
{
	/**
	 * Finds the minimum value in an array of doubles.
	 * @param array Some array of doubles. Must have a length over 0.
	 * @return The minimum value in that array.
	 */
	public static double findMin(double[] array)
	{
		double minimum = array[0];
		//double minimum = Double.MAX_VALUE;
		for(double element : array)
		{
			if(element < minimum)
			{
				minimum = element;
			}
		}
		return minimum;
	}
	
	/**
	 * Finds the maximum value in an array of doubles.
	 * @param array Some array of doubles. Must have a length over 0.
	 * @return The maximum value in that array.
	 */
	public static double findMax(double[] array)
	{
		double maximum = array[0];
		//double maximum = Double.MIN_VALUE;
		for(double element : array)
		{
			if(element > maximum)
			{
				maximum = element;
			}
		}
		return maximum;
	}
	
	/**
	 * Find the minimum and maximum in an array of doubles.
	 * @param array Some array of doubles. Must have a length over 0.
	 * @return An array of two doubles: the minimum and maximum value from the input array.
	 */
	public static double[] findExtremes(double[] array)
	{
		//We don't need to do all of this because we already have methods to find min and max!
//		double minimum = array[0];
//		//double minimum = Double.MAX_VALUE;
//		for(double element : array)
//		{
//			if(element < minimum)
//			{
//				minimum = element;
//			}
//		}
//		double maximum = array[0];
//		//double maximum = Double.MIN_VALUE;
//		for(double element : array)
//		{
//			if(element > maximum)
//			{
//				maximum = element;
//			}
//		}
//		return new double[]{minimum, maximum};
		
		//This would be a valid line because Java can understand this as an array of doubles in the context of the left side of the equals side.
		// 		If we simply returned the thing on the right side of the equal sign, java would not know for sure what kind of array this is, so it does not compile.
		//double[] extremes = {findMin(array), findMax(array)};
		
		//We can complete this entire method in this one line
		return new double[] {findMin(array), findMax(array)};
	}
	
	/**
	 * Prints out the contents of whatever array of doubles is given.
	 * @param array. Some array of doubles.
	 */
	public static void printArray(double[] array)
	{
		if(array.length == 0)
		{
			System.out.println("[]");
			return;
		}
		
		String rep = "[";
		for(double element: array)
		{
			rep += element + ", ";
		}
		
		rep = rep.substring(0, rep.length()-2);
		rep += "]";
		System.out.println(rep);
	}
	
	
	
	public static void main(String[] args) 
	{
		//Test out our extreme values methods
		double[] values = {800, -9, 1, 2, 3, 5.5, 8.2, -4, 90, 1, -6, 8, -15, 102, 923.4};
		System.out.println(ArrayProcessor.findMin(values));
		System.out.println(ArrayProcessor.findMax(values));
		ArrayProcessor.printArray(ArrayProcessor.findExtremes(values));
		
		//Test out our printArray method with a really big array
		double[] bigValues = new double[10000];
		for(int i = 0; i < bigValues.length; i++)
		{
			bigValues[i] = i;
		}
		printArray(bigValues);
		
		//Test out our printArray method with a really small array
		double[] smallValues = new double[0];
		printArray(smallValues);
		
		// This is a dumb thing one of yinz inspired me to write in class.
		// It is a search procedure to find the biggest legal array
		int i = 0;
		while(true)
		{
			try
			{
				i++;
				double[] reallyBigValues = new double[Integer.MAX_VALUE-i]; // This will often throw an exception because the array is too big for Java to handle.
				printArray(reallyBigValues);
				break;
			}
			catch(OutOfMemoryError e)
			{
				System.out.println(Integer.MAX_VALUE-i + " was too big.");
			}
		}
		
		
	}

}
