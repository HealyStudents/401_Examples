package constructor_examples;

public class NoDefault 
{
	int j;
	
//	public NoDefault() 
//	{
//		//do nothing
//	}
	
	public NoDefault(int i)
	{
		j = i;
	}
	
	
	public static void main(String[] args) 
	{
		NoDefault nd = new NoDefault();
	}

}
