package hash;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetExamples 
{

	public static void main(String[] args) 
	{
		HashSet<String> setOfStrings = new HashSet<String>();
		setOfStrings.add("Hello!");
		setOfStrings.add("Goodbye!");
		setOfStrings.add("FooBar");
		
		//This is not added because it would have been a duplicate
		setOfStrings.add("Hello!");
		
		System.out.println(setOfStrings);
		
		//Convert our set to an arrayList
		ArrayList<String> uniqueList = new ArrayList<String>(setOfStrings);
		System.out.println(uniqueList);
		uniqueList.sort(null);
		System.out.println(uniqueList);
	}

}
