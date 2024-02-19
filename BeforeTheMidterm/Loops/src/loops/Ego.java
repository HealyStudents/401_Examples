package loops;

/**
 * A simple example of a while loop that loops 1000 times. There are two examples here and only one is correct -- this code is meant to get us to think about off-by-one errors. Which of these is correct and how do you know?
 */
public class Ego 
{

	public static void main(String[] args) 
	{
		int calebCount = 0;
		int jonahCount = 0;
		
		//Answer 1
		int i = 0;
		while (i < 1000)
		{
			System.out.println("Caleb");
			calebCount++;
			i++;
		}

		//Answer 2
		i = 0;
		while(i<1001)
		{
			System.out.print("Jonah");
			jonahCount++;
			i++;
		}
		
		System.out.println();
		System.out.println("Caleb count: " + calebCount);
		System.out.println("Jonah count: " + jonahCount);

	}

}
