package arrays;

public class MinAndMax 
{
	
	public static double findMin(double[] data)
	{
		double min = data[0];
		// (i < data.length) == (i <= data.length - 1)
		for(int i = 0; i < data.length; i++)
		{
			min = Math.min(min, data[i]);
		}
		return min;
	}
	
	public static double findMinEnhanced(double[] data)
	{
		double min = data[0];
		// (i < data.length) == (i <= data.length - 1)
		for(double element : data)
		{
			min = Math.min(min, element);
		}
		return min;
	}
	
	public static double findMax(double[] data)
	{
		double max = data[0];
		// (i < data.length) == (i <= data.length - 1)
		for(int i = 0; i < data.length; i++)
		{
			max = Math.max(max, data[i]);
		}
		return max;
	}
	
	public static double findMaxEnhanced(double[] data)
	{
		double max = data[0];
		// (i < data.length) == (i <= data.length - 1)
		for(double element : data)
		{
			max = Math.max(max, element);
		}
		return max;
	}
	
	public static double[] findExtremes(double[] data)
	{
		double[] extremes = new double[2];
		extremes[0] = findMin(data);
		extremes[1] = findMax(data);
		return extremes;
	}
	
	public static void printArray(double[] data)
	{
		for(double number : data)
		{
			System.out.print(number + ", ");
		}
		System.out.println();
	}

	public static void main(String[] args) 
	{
		double[] testData = new double[] {1, 2, 3, 4, 5, 0, 10, 2, -8};
		printArray(testData);
		
		printArray(findExtremes(testData));
		
//		System.out.println(findMin(testData));
//		System.out.println(findMax(testData));
//		
//		System.out.println(findMinEnhanced(testData));
//		System.out.println(findMaxEnhanced(testData));
	}

}
