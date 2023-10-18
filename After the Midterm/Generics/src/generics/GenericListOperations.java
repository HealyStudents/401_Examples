package generics;

public class GenericListOperations
{
	public static <T extends Comparable<T>> void printArray(T[] data)
	{
		for(T element : data)
		{
			System.out.print(element + ", ");
		}
		System.out.println();
	}
	
	public static <T extends Comparable<T>> T findMin(T[] data)
    {
        T min = data[0];
        for(int i = 0; i < data.length; i++)
        {
        	//Will return 0 if equal, <0 if less
        	if(data[i].compareTo(min) < 0)
        	{
        		min = data[i];
        	}
        }
        return min;
    }
}
