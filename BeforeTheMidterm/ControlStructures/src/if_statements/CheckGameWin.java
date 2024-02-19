package if_statements;

/**
 * This example demonstrates how to use an else-if to chain if statement blocks together.
 */
public class CheckGameWin 
{

	public static void main(String[] args) 
	{
		/*In a game program, the scores of players 
		 * A and B are stored in variables scoreA and scoreB. 
		 * Assuming that the player with the larger score wins, 
		 * write an if/else sequence that prints out 
		 * "A won", "B won", or "Game tied".*/
		
		int scoreA = 5;
		int scoreB = 5;
		if(scoreA > scoreB)
		{
			System.out.println("A won");
		}
		else if(scoreB > scoreA)
		{
			System.out.println("B won");
		}
		else
		{
			System.out.println("Game tied");
		}
	}

}
