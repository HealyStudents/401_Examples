package fileio;

import java.io.FileReader;
import java.io.IOException;

public class RiskyHandlingIOException 
{
	//This is the risky way to "handle" an IOException (not handling it)
	public static void main(String[] args) throws IOException
	{
		FileReader fr = new FileReader("Names.txt");
	}

}
