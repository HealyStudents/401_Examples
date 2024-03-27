package hash;

import java.util.HashMap;

public class HashMapExamples
{

	public static void main(String[] args) 
	{
		//Arrays are indexed by numbers
		String[] arr = new String[5];
		arr[0] = "Hello";
		arr[2] = "Goodbye";
		
		//HashMaps are indexed by *whatever we want*
		HashMap<Integer, String> mapping = new HashMap<Integer, String>();
		mapping.put(0, "Hello"); //This basically does what line 12 does
		
		//We could map based on other strings
		HashMap<String, String> nameMapping = new HashMap<String, String>();
		nameMapping.put("Healy", "Pat");
		
		System.out.println(nameMapping.get("Healy"));
	}

}
