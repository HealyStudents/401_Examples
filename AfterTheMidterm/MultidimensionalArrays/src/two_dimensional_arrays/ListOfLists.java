package two_dimensional_arrays;

import java.util.ArrayList;

public class ListOfLists 
{

	public static void main(String[] args) 
	{
		//Much like our 2D arrays, we can make an ArrayList made up of other ArrayLists
		ArrayList<ArrayList<Integer>> nestedList = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		nestedList.add(numbers);
		numbers.add(5);
		numbers.add(3);
		numbers.add(1);

		ArrayList<Integer> numbers2 = new ArrayList<Integer>();
		nestedList.add(numbers2);
		numbers2.add(10);
		numbers2.add(2);
		numbers2.add(9);

		System.out.println(nestedList);
	}

}
