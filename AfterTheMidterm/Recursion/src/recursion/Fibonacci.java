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
		System.out.println();
	}
	
	//A recursive solution
	public static void fibonacciRecurse(int number, int x1, int x2)
	{
		//generate the next term
		int nextTerm = x1 + x2;
		System.out.print(nextTerm + ", ");
		
		//base case
		if(number == 1)
		{
			System.out.println();
			return;
		}
		
		//recursive case
		fibonacciRecurse(number - 1, x2, nextTerm);
	}



	public static void main(String[] args) 
	{
		fibonacciLoop(5);
		fibonacciRecurse(5, 0, 1);
		fibonacciRecurse(15, 0, 1);
		fibonacciRecurse(-10, 0, 1);
		
		// TODO Auto-generated method stub

	}

}
