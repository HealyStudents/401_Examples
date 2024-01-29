package loops;

public class InfiniteLoop 
{

	public static void main(String[] args) 
	{
		double balance = 10000;
		double targetBalance = 20000;
		final double RATE = 0.01;
		
		int years = 20;
		while (years > 0)
		{ 
		   double interest = balance * RATE / 100;
		   balance = balance + interest;
		   //Incrementing instead of decrementing causes our infinite loop!
		   years++;
		}

	}

}
