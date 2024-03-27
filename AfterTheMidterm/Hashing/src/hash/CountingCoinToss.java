package hash;

import java.util.HashMap;

public class CountingCoinToss 
{

	//Simulate x number of coin tosses, 
	// return a HashMap indicating the totals of heads and tails
	public static HashMap<String, Integer> simulateCoinTosses(int x)
	{
		HashMap<String, Integer> tosses = new HashMap<String, Integer>();
		tosses.put("Heads", 0);
		tosses.put("Tails", 0);
		
		//Repeating X times...
		while(x > 0)
		{
			//Simulate a coin toss
			boolean heads = (Math.random() >= 0.5);
			if(heads)
			{
				tosses.put("Heads", tosses.get("Heads") + 1);
			}
			else
			{
				tosses.put("Tails", tosses.get("Tails") + 1);
			}
			x--;
		}
		
		return tosses;
	}
	
	
	public static void main(String[] args) 
	{
		HashMap<String, Integer> results = simulateCoinTosses(100);
		System.out.println(results);
	}

}
