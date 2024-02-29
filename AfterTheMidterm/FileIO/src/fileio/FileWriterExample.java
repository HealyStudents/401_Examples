package fileio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileWriterExample 
{

	public static void main(String[] args) 
	{
		try
		{
			//Open up a file writing stream
			//By default we open the file in a mode that will overwrite any existing file
			FileWriter fw = new FileWriter("NewNames.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			
			String[] names = new String[] {"James", "Jennifer", "Donna", "Kenny"};
			
			//iterate through our names
			for(String nm : names)
			{
				//Write a name, append a new line
				bw.write(nm + "\n");
			}
			
			bw.close();
			fw.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
