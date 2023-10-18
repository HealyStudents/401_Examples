package generics;

public class GenericListTester 
{

	public static void main(String[] args) 
	{
		String[] stringList = new String[] {"hello", "world", "!", "foo", "bar"};
		Integer[] intList = new Integer[] {1,3,6,28,7,10,-3};
		Double[] doubleList = new Double[] {3.2, 1.0, 5.6, 12.356, 25.2, -14.0};
		
		GenericListOperations.printArray(stringList);
		System.out.println(GenericListOperations.findMin(stringList));
		
		GenericListOperations.printArray(intList);
		System.out.println(GenericListOperations.findMin(intList));
		
		GenericListOperations.printArray(doubleList);
		System.out.println(GenericListOperations.findMin(doubleList));
	}

}
