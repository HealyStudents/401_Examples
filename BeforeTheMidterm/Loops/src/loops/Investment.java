package loops;

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
