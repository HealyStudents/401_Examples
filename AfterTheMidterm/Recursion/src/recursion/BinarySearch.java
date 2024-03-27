package recursion;

import java.util.Arrays;
import java.util.ArrayList;

public class BinarySearch 
{
	public static void main(String[] args) 
	{
		int[] data = generateRandomData(15);
		printArray(data);
		System.out.println(search(data, 10));
//		int[] data = new int[] {1, 2, 3, 5, 6, 8};
//		System.out.println(search(data, 10));
	}
	
	/***
	 * 
	 * @param data is a sorted array
	 * @param key
	 * @return
	 */
	public static int search(int[] data, int key)
	{
		//printArray(data);
		
		//Other base case (the thing we're looking for isn't here)
		if(data.length == 0)
			return -1;
		
		// Find the center point of data
		int centerIndex = data.length/2;
		int centerPoint = data[centerIndex];
		
		//Compare key with that central point
		// If we've found key, return its index (this is the base case)
		if(centerPoint == key)
			return centerIndex;
		//Otherwise, generate an appropriate subarray and recurse (recursive case)
		int[] tempArray;
		if(key < centerPoint)
		{
			//The long way of generating a subarray
			tempArray = new int[centerIndex];
			for(int i = 0; i < centerIndex; i++)
				tempArray[i] = data[i];
			return search(tempArray, key);
		}
		else
		{
			//Tbe short way of generating a subarray
			tempArray = Arrays.copyOfRange(data, centerIndex+1, data.length);
			int searchResult = search(tempArray, key);
			if(searchResult < 0) return -1;
			return centerIndex + 1 + searchResult;
		}
	}
	
	public static int[] generateRandomData(int length)
	{
		int[] data = new int[length];
		for(int i = 0; i < length; i++)
		{
			data[i] = (int)(Math.random()*100);
		}
		return data;
	}
	
	public static void printArray(int[] data)
	{
		System.out.print("[");
		for(int element : data)
		{
			System.out.print(element + ", ");
		}
		System.out.println("]");
	}

}
