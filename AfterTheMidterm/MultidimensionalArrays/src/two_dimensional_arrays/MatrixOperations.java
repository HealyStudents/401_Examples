package two_dimensional_arrays;

public class MatrixOperations 
{

	/***
	 * Calculates the matrix sum of two 2D arrays.
	 * 
	 * @param arrA some non-empty 2D array of integers with the same dimensions as arrB.
	 * @param arrB some non-empty 2D array of integers with the same dimensions as arrA.
	 * @return The matrix sum of arrA and arrB.
	 */
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

	public static void main(String[] args) 
	{
		//Manually create two 2D arrays
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

		System.out.println("A:");
		Simple2DArrayOperations.print2D(arrayA); //Calls the method in the other example class
		System.out.println("B:");
		Simple2DArrayOperations.print2D(arrayB);

		System.out.println("\nThe sum of A and B:");
		Simple2DArrayOperations.print2D(matrixSum(arrayA, arrayB));

		//There is an easier way to instantiate a multi-dimensional array like this, though:
		arrayA = new int[][] {{0, 2}, {5, 7}};
		arrayB = new int[][] {{8, -1}, {3, 1}};
		// ^^^^ notice that these two lines are doing the same thing that lines 103-113 were doing.

		System.out.println("\nA (but instantiated in one line):");
		Simple2DArrayOperations.print2D(arrayA);
		System.out.println("\nB (but instantiated in one line):");
		Simple2DArrayOperations.print2D(arrayB);
	}

}
