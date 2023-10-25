package hashing;

import java.util.HashMap;

public class HashMapExample 
{

	public static void main(String[] args) 
	{
		HashMap<String,String> favoriteColors = new HashMap<String, String>();
		favoriteColors.put("Laura", "Orange");
		favoriteColors.put("Eric", "Blue");
		
		System.out.println(favoriteColors.get("Eric"));
		
		System.out.println(favoriteColors);
	}

}
