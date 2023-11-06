package recursion;

public class Fibonacci 
{
	public static void fib(int num, int first, int second)
	{
		if (num>0)
        {
            int third = first + second;
            System.out.println(first);
            //System.out.println(third);
            first = second;
            second = third;
            fib(num-1,first,second);
        }
	}
	
	
	public static void main(String[] args) 
	{
		fib(5, 0, 1);
	}

}
