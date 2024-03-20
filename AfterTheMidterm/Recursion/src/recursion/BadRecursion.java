package recursion;

public class BadRecursion 
{
	//Imagine calling magicMath(9)
	public static int magicMath(int x)
	{
		if(x % 3 == 0) return magicMath(4);
		if(x % 2 == 0) return magicMath(7);
		if(x % 3 == 1) return magicMath(9);
		return x*2;
	}

	
	public static int factorial (int x) 
	{
		//Base case:
		if(x == 0)
			return 1;
		
		//Recursive case:
		int temp = x * factorial(x-1);
		return temp;
	}

	public static void main(String[] args) 
	{
		System.out.println(factorial(5));
	}

}
