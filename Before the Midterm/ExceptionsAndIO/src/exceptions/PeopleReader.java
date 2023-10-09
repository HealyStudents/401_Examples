package exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PeopleReader 
{

	public static void main(String[] args) throws IOException
	{
		FileReader fr = new FileReader("people.txt");
		BufferedReader reader = new BufferedReader(fr);
		
		ArrayList<Person> people = new ArrayList<Person>();
		
		String line = reader.readLine();
		while(line != null)
		{
			String[] tokens = line.split(";");
			Person thisPerson = new Person(tokens[0], Integer.parseInt(tokens[1]));
			people.add(thisPerson);	
			line = reader.readLine();
		}
		
		System.out.println(people);
	}

}
