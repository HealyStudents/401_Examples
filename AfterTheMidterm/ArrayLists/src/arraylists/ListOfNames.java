package arraylists;

import java.util.ArrayList;

public class ListOfNames 
{

	public static void main(String[] args) 
	{
		//Create a new ArrayList
		ArrayList<String> names = new ArrayList<String>();
		
		//Add some stuff to the arraylist
		names.add("Emily"); // Now names has size 1 and element "Emily”
		names.add("Bob"); // Now names has size 2 and elements "Emily", "Bob”
		names.add("Cindy"); // names has size 3 and elements "Emily", "Bob", and "Cindy"
		
		//Print out an arraylist
		System.out.println(names);
		
		//Get an element in an arraylist at some index
		String name = names.get(2);
		System.out.println("Name at index 2: " + name);
		
		//Get the size of an arraylist (not the length)
		int i = names.size();
		System.out.println("Size of the list: " + i);
		
		//Set an item at some index
		System.out.println("Setting index 2...");
		names.set(2, "Carolyn");
		name = names.get(2);
		System.out.println(names);
		
		//Add something at a specific index
		names.add(1, "Ann");
		System.out.println(names);
		
		//Remove something at a specific index
		names.remove(1);
		System.out.println(names);
		
		//Using an enhanced for loop
		for (String nm : names) 
		{
			System.out.println(nm);
		}
		
		//Make a copy of an arraylist
		ArrayList<String> newNames = new ArrayList<String>(names);
	}

}
