package Basic2DExample;

public class Basic2DArray 
{
	public static void print2D(int[][] arr)
	{
		//Get a row from a 2D array: arr[i]
		//Get a column from the i'th row of a 2D array: arr[i][k]
		
		for(int row = 0; row < arr.length; row++)
		{
			for(int col = 0; col < arr[row].length; col++)
			{
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
	}
	
	public static int sum2D(int[][] arr)
    {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                sum += arr[i][j];
            }
        }
        return sum;
    }
	
	public static int[][] matrixSum(int[][] arrayA, int[][] arrayB)
	{
		if(arrayA.length != arrayB.length || arrayA[0].length != arrayB[0].length)
		{
			throw new IllegalArgumentException("Arrays were not the same dimensions!");
		}
		
		int[][] sum = new int[arrayA.length][arrayA[0].length];
		
		for(int row = 0; row < sum.length; row++)
		{
			for(int col = 0; col < sum[row].length; col++)
			{
				sum[row][col] = arrayA[row][col] + arrayB[row][col];
			}
		}
		
		return sum;
	}
	

	public static void main(String[] args) 
	{
//		int[][] arr = new int[5][5];
//		print2D(arr);
		
		int[][] arrA = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		print2D(arrA);
		System.out.println();
		
		int[][] arrB = new int[][] {{0, 2, 0}, {1, 2, 0}, {1, 10, -1}};
		print2D(arrB);
		System.out.println();
		
		print2D(matrixSum(arrA, arrB));
		
		//System.out.println(sum2D(arr));
		
		//Ahhhhhhhh (10-D Array)
		int [][][][][][][][][][] bigGuy = new int[5][5][5][5][5][5][5][5][5][5];
	}

}
