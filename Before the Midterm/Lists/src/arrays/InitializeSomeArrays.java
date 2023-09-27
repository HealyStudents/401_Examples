package arrays;

public class InitializeSomeArrays 
{

	public static void main(String[] args) 
	{
		/*
		 * 10 chars
		 * 5 integers
		 * 10 boolean
		 * 25 float
		*/
		
		char[] myChars = new char[10];
		int[] myInts = new int[5];
		boolean[] myBooleans = new boolean[10];
		for(int i = 0; i < myBooleans.length; i++)
		{
			myBooleans[i] = true;
		}
		
		System.out.println(myBooleans);
		System.out.print("[");
		for(int i = 0; i < myBooleans.length; i++)
		{
			if(i == myBooleans.length - 1)
				System.out.print(myBooleans[i]);
			else
				System.out.print(myBooleans[i] + ", ");
		}
		System.out.println("]");
		
		float[] myFloats = new float[25];
		
		//long exampleNum = 15;
		//int a = (int) exampleNum;
		String[] myStrings = new String[5];
		for(int i = 0; i < myStrings.length; i++)
		{
			System.out.print(myStrings[i] + ",");
		}
	}

}
