package loops;

public class DoWhileExample 
{

	public static void main(String[] args) 
	{
		//Normal while loop:
		int i = 1000;
		while (i<1000)
		{
			System.out.println(2*i + 1);
			i++;
		}
		
		i = 1000;
		do
		{
			System.out.println(2*i + 1);
			i++;
		} while(i<1000);
		
		
	}

}
