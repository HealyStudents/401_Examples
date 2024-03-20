package recursion;

public class Fibonacci 
{
	//An iterative (non-recursive) solution
	public static void fibonacciLoop(int number) 
	{
		int element1 = 1;
		int element2 = 1;		
		System.out.print(element1 + ", " + element2);

		for (int i = 3; i <= number; i++) {
			int temp = element1 + element2; // Fibonacci number is sum of previous two Fibonacci number
			element1 = element2;
			element2 = temp;
			System.out.print(", " + temp);
		}
	}
	
	



	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}
