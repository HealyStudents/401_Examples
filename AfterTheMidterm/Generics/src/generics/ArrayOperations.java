package generics;

public class ArrayOperations 
{
	
	public static <T> void printArray(T[] array)
	{
		if(array.length == 0)
		{
			System.out.println("[]");
			return;
		}
		
		String rep = "[";
		for(T element: array)
		{
			rep += element + ", ";
		}
		
		rep = rep.substring(0, rep.length()-2);
		rep += "]";
		System.out.println(rep);
	}

	public static void main(String[] args) 
	{
		Double[] values = new Double[]{800.0, -9.0, 1.0, 2.0, 3.0, 5.5, 8.2, -4.0, 90.0, 1.0, -6.0, 8.0, -15.0, 102.0, 923.4};
		printArray(values);
		
		String[] stringValues = new String[] {"Foo", "Bar", "FooBar", "Apple"};
		printArray(stringValues);
	}

}
