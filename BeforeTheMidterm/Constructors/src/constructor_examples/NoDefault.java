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
		//This line does not compile because the default constructor does not exist -- it has been overridden
		//NoDefault nd = new NoDefault();
	}

}
