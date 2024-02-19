package review;

public class Chair 
{
	private int numLegs;

	public Chair(int legs)
	{
		/*try
		{
			setNumLegs(legs);
		}
		catch(IllegalArgumentException e)
		{
			throw new IllegalStateException("That's not a valid object!");
		}*/
		if(legs < 3)
			throw new IllegalStateException("That's not a valid object!");
		this.numLegs = legs;
	}

	public void setNumLegs(int legs)
	{
		if(legs < 3)
			throw new IllegalArgumentException("That's not enough legs");
		this.numLegs = legs;
	}

	public static void main(String[] args) 
	{
		Chair coolChair = new Chair(1);
	}

}
