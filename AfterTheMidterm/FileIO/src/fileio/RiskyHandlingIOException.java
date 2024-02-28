package fileio;

import java.io.FileReader;
import java.io.IOException;

public class RiskyHandlingIOException 
{

	public static void main(String[] args) throws IOException
	{
		FileReader fr = new FileReader("Names.txt");
	}

}
