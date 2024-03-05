package two_dimensional_arrays;

import java.util.ArrayList;

public class Simple2DArrayOperations 
{
	/***
	 * Iterates through all values of a 2D array of integers and calculates their sum.
	 * 
	 * @param arr Some 2D array of integers
	 * @return the sum
	 */
	public static int sum2D(int[][] arr)
	{
		int sum=0;
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				sum+=arr[i][j];
			}
		}

		return sum;
	}

	/***
	 * Prints the contents of a 2D array to console.
	 * 
	 * @param arr Some 2D array of integers
	 */
	public static void print2D(int[][] arr)
	{
		System.out.println("[");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print("    [");
			for(int j = 0; j < arr[i].length; j++)
			{
				System.out.print(arr[i][j] + ",");
			}
			System.out.println("]");
		}
		System.out.println("]");
	}

	public static void main(String[] args) 
	{
		//Creates a 2D array of integers with 5 rows and 3 columns
		int[][] data = new int[5][3];
		
		/* we could also think of this data as an array containing arrays of integers
	 	 * i.e. in this case data is an array containing 5 int arrays. Each of those inner arrays have 3 elements:
		 *
		 * So that would look like this:
		 * 	[[0,0,0],
		 * 	 [0,0,0],
		 * 	 [0,0,0],
		 * 	 [0,0,0],
		 * 	 [0,0,0]]
		 * 
		 * or, to write the same data structure in a different way:
		 *  [[0,0,0], [0,0,0], [0,0,0], [0,0,0], [0,0,0]]
		 */

		// We can change data in this data structure in a pretty similar way to a "normal" array
		data[2][2] = 5; //Changes our 3rd row, 3rd column to 5
		data[4][1] = 10;
		data[0][0] = -25;
		data[4][2] = -2;

		//Call our print2D method, which will look through data and print it out
		print2D(data);	
		
		//Calculate the sum of all values in data
		System.out.println("Sum: " + sum2D(data));
		
		
		int[][] bigData = new int[13][13];
		//These two loops iterate through bigData to generate a multiplication table.
		for(int i = 0; i < bigData.length; i++)
		{
			for(int j = 0; j < bigData[i].length; j++)
			{
				bigData[i][j] = i*j;
			}
		}
		
		print2D(bigData);
		System.out.println("Sum: " + sum2D(bigData));
	}

}
