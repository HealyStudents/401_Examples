package fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileReaderExample 
{

	public static void main(String[] args) 
	{
		try
		{
			//Open up a file reading stream
			FileReader fr = new FileReader("Names.txt");
			BufferedReader br = new BufferedReader(fr);
			
			//Read in the first line
//			String name1 = br.readLine();
//			System.out.println(name1);
			
			ArrayList<String> people = new ArrayList<String>();
			String line = br.readLine();
			while(line != null)
			{
				people.add(line);
				line = br.readLine();
			}
			
			System.out.println(people);
			
			br.close();
			fr.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
