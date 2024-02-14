package array_examples;

public class ArrayProcessor 
{
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
	
	public static double[] findExtremes(double[] array)
	{
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
		//double[] extremes = {findMin(array), findMax(array)};
		
		return new double[] {findMin(array), findMax(array)};
	}
	
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
		double[] values = {800, -9, 1, 2, 3, 5.5, 8.2, -4, 90, 1, -6, 8, -15, 102, 923.4};
		System.out.println(ArrayProcessor.findMin(values));
		System.out.println(ArrayProcessor.findMax(values));
		ArrayProcessor.printArray(ArrayProcessor.findExtremes(values));
		
		double[] bigValues = new double[10000];
		for(int i = 0; i < bigValues.length; i++)
		{
			bigValues[i] = i;
		}
		printArray(bigValues);
		
		double[] smallValues = new double[0];
		printArray(smallValues);
		
		//a search procedure to find the biggest legal array
		int i = 0;
		while(true)
		{
			try
			{
				i++;
				double[] reallyBigValues = new double[Integer.MAX_VALUE-i];
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
