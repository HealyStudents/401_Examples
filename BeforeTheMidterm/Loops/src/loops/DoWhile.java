package loops;

public class DoWhile 
{

	public static void main(String[] args) 
	{
		System.out.println("Version 1:");
		int i = 1000;
		while(i < 1000)
		{
			System.out.println(2*i+1);
			i++;
		}
		
		System.out.println("Version 2:");
		//The same thing with a do-while
		i = 1000;
		do
		{
			System.out.println(2*i+1);
			i++;
		}
		while(i < 1000);
	}

}
