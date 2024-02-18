package array_examples;

/**
 * Various examples of declaring and initializing arrays.
 */
public class CreatingArrays 
{

	public static void main(String[] args) 
	{
		/*
		 * Declare and initialize arrays of
			10 chars
			5 integers
			10 boolean
			25 float
		 */
		
		//By default, arrays always begin as lists of the value 0 (applied to whatever 0 means in the particular context of that data type), or if it's an object it defaults to nulls.
		char[] charArr = new char[10];
		int[] intArr = new int[5];
		boolean[] boolArr = new boolean[10];
		float[] floatArr = new float[25];
		
		System.out.println(intArr[0]);
		
		double[] values = { 32, 54, 67.5, 29, 44.5, 100, 65 };
		int[] numbers = {0, 1, 1, 2, 3, 5, 8, 13, 21};

		String[] names = {"John", "Mary", "Chris", "Jane", "Amanda"};

		System.out.println(names[0]);
		
		names[0] = "Pat";
		System.out.println(names[0]);
//		System.out.println(names[-2]);
		
		System.out.println(names[names.length - 1]);
		// Array of length zero: new int[0];
	}

}
