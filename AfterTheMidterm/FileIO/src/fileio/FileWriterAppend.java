package fileio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterAppend 
{

	public static void main(String[] args) 
	{
		//Rather than overwriting the existing file, this code appends to an existing file
		try
		{
			//Open up a file writing stream
			//By passing true as a second parameter, we open in APPEND mode
			FileWriter fw = new FileWriter("Names.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			
			//Add Pat to the list
			bw.write("Pat\n");
			
			bw.close();
			fw.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
