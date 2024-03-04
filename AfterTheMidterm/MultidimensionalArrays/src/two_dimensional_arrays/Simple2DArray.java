package two_dimensional_arrays;

import java.util.ArrayList;

public class Simple2DArray 
{

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
	
	public static int[][] matrixSum(int[][] arrA, int[][] arrB)
	{
		if(arrA.length == 0 || arrB.length == 0) 
			throw new IllegalArgumentException("Matrix had no data!");
		if(arrA.length != arrB.length || arrA[0].length != arrB[0].length)
			throw new IllegalArgumentException("Matrices had different dimensions!");
		
		int[][] sum = new int[arrA.length][arrA[0].length];
		
		for(int i = 0; i < sum.length; i++)
		{
			for(int j = 0; j < sum[i].length; j++)
			{
				sum[i][j] = arrA[i][j] + arrB[i][j];
			}
		}
		
		return sum;
	}

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
		//Nesting arraylists
		//		ArrayList<ArrayList<Integer>> nestedList = new ArrayList<ArrayList<Integer>>();
		//		ArrayList<Integer> numbers = new ArrayList<Integer>();
		//		nestedList.add(numbers);
		//		numbers.add(5);
		//		numbers.add(3);
		//		numbers.add(1);
		//		
		//		ArrayList<Integer> numbers2 = new ArrayList<Integer>();
		//		nestedList.add(numbers2);
		//		numbers2.add(10);
		//		numbers2.add(2);
		//		numbers2.add(9);
		//		
		//		System.out.println(nestedList);

		int[][] data = new int[5][3];

		//Changes our 3rd row, 3rd column to 5
		data[2][2] = 5;
		data[4][1] = 10;
		data[0][0] = -25;
		data[4][2] = -2;

		print2D(data);	
		
		System.out.println("Sum: " + sum2D(data));
		
		int[][] bigData = new int[13][13];
		
		int sum = 0;
		for(int i = 0; i < bigData.length; i++)
		{
			for(int j = 0; j < bigData[i].length; j++)
			{
				bigData[i][j] = i*j;
				sum += i*j;
			}
		}
		
		print2D(bigData);
		System.out.println("Theoretical sum: " + sum);
		System.out.println("Sum: " + sum2D(bigData));
		
		int[][] arrayA = new int[2][2];
		int[][] arrayB = new int[2][2];
		arrayA[0][0] = 0;
		arrayA[0][1] = 2;
		arrayA[1][0] = 5;
		arrayA[1][1] = 7;
		
		arrayB[0][0] = 8;
		arrayB[0][1] = -1;
		arrayB[1][0] = 3;
		arrayB[1][1] = 1;
		
		print2D(arrayA);
		print2D(arrayB);
		
		print2D(matrixSum(arrayA, arrayB));
	}

}
