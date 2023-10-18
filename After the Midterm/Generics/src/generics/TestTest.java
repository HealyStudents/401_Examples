package generics;

public class TestTest 
{

	public static void main(String[] args) 
	{
		Test<String> testString = new Test<String>("Hello");
		System.out.println(testString.getObject());
		
		Test<Integer> testInt = new Test<Integer>(25);
		System.out.println(testInt.getObject());
	}

}
