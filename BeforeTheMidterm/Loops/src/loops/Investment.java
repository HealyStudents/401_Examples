package loops;

/**
 * A practical use case of a loop -- while we haven't yet reached our target balance, we will simulate accumulation of interest over one year.
 */
public class Investment 
{

	public static void main(String[] args) 
	{
		double balance = 10000;
		double targetBalance = 20000;
		final double RATE = 0.01;
		int year = 0;

		while (balance < targetBalance)
		{
		   year++;
		   double interest = balance * RATE / 100;
		   balance = balance + interest;
		   System.out.println(year + ": " + balance);
		}

	}

}
