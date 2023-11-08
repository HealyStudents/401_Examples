package recursion;

import java.util.Arrays;

public class BinarySearch 
{
	
	public static int binarySearch(int[] arr, int element)
	{
		//TWO BASE CASES
		//if the element is not in the array Return -1
		if(arr.length < 1) return -1;
		if(arr.length == 1 && arr[0] != element) return -1;
		
		int index = arr.length / 2;
		//if we have found the element, we return this index
		if(arr[index] == element) return index;
		
		//RECURSIVE CASE
		//Otherwise, recurse
		if(arr[index] > element)
		{
			//Get a copy of the array from the start to the index
			// (not including the index)
			int[] lowerSubArray = Arrays.copyOf(arr, index);
			return binarySearch(lowerSubArray, element);
		}
		else
		{
			//Get a copy of the array from one after the index to the end of the array
			int[] upperSubArray = Arrays.copyOfRange(arr, index+1, arr.length);
			int upperSearch = binarySearch(upperSubArray, element);
			if(upperSearch == -1) return -1;
			return index + 1 + upperSearch;
		}
	}

	public static void main(String[] args) 
	{
		int[] numbers = new int[] {2,4,12,13,17,25,44,55};
		System.out.println(binarySearch(numbers, 25));
	}

}
