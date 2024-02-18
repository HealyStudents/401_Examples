package loops;

/**
 * The main method in this code simply prints out a whole ascii table, demonstrating how one can use characters as if they are numbers.
 */
public class ASCIITable 
{
	public static void main(String[] args) 
	{
		for (char myChar=' '; myChar<='}'; myChar++)
		{
			System.out.println((int) myChar + "\t" + myChar);
		}
	}
}

