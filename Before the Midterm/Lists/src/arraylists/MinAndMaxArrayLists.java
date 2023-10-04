package arraylists;

import java.util.ArrayList;

public class MinAndMaxArrayLists
{

    public static double findMin(ArrayList<Double> data)
    {
	double min = data.get(0);
	for(int i = 0; i < data.size(); i++)
	{
	    min = Math.min(min, data.get(i));
	}
	return min;
    }

    public static double findMax(ArrayList<Double> data)
    {
	double max = data.get(0);
	for(int i = 0; i < data.size(); i++)
	{
	    max = Math.max(max, data.get(i));
	}
	return max;
    }

    public static void main(String[] args)
    {
	//Set up data
	double[] testDataArr = new double[] {1, 2, 3, 4, 5, 0, 10, 2, -8};
	//Create an arraylist
	ArrayList<Double> testData = new ArrayList<Double>();
	//Add our data to the arraylist
	for(double element: testDataArr) 
	    testData.add(element);
	
	System.out.println(testData);
	
	//printArray(testData);
	
	//printArray(findExtremes(testData));
	
	System.out.println(findMin(testData));
	System.out.println(findMax(testData));
    }

}
