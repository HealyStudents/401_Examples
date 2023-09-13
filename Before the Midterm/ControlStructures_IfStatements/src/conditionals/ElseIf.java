package conditionals;

public class ElseIf 
{
	public static String determineWinner(int scoreA, int scoreB)
	{
		if(scoreA > scoreB)
		{
			return "A Wins!";
		}
		else if(scoreB > scoreA)
		{
			return "B Wins!";
		}
		else
		{
			return "Game tied.";
		}
	}
	
	public static String determineWinnerV2(int scoreA, int scoreB)
	{
		if(scoreA > scoreB)
		{
			return "A Wins!";
		}
		
		if(scoreB > scoreA)
		{
			return "B Wins!";
		}
		
		return "Game tied.";
	}
	
	public static String determineWinnerV3(int scoreA, int scoreB)
	{
		String winner = "Game tied.";
		if(scoreA > scoreB)
		{
			winner = "A Wins!";
		}
		
		if(scoreB > scoreA)
		{
			winner = "B Wins!";
		}
		
		return winner;
	}
	
	public static void main(String[] args) 
	{
		System.out.println(determineWinner(5, 6));
		System.out.println(determineWinnerV2(5, 6));
		System.out.println(determineWinnerV3(5, 6));
	}

}
