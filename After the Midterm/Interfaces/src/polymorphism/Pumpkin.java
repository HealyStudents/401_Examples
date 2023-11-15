package polymorphism;

import java.util.Arrays;

public class Pumpkin implements Comparable<Pumpkin>
{
	public String farmer;
	public double mass;
	
	public Pumpkin(String farmer, double mass)
	{
		this.farmer = farmer;
		this.mass = mass;
	}
	
	@Override
	public int compareTo(Pumpkin other) {
		if(this.mass > other.mass) return 1;
		else if(this.mass < other.mass) return -1;
		return 0;
	}
	
	public String toString()
	{
		return this.farmer + ": " + this.mass;
	}

	public static void main(String[] args)
	{
		Pumpkin[] pumpkins = new Pumpkin[] {
				new Pumpkin("Joe", 7.2),
				new Pumpkin("Harold", 2),
				new Pumpkin("Jason", 8.3),
				new Pumpkin("Freddy", 1.2)
		};
		
		Arrays.sort(pumpkins);
		
		for(Pumpkin p : pumpkins)
		{
			System.out.println(p);
		}
	}
}
