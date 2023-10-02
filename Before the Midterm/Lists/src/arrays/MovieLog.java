package arrays;

public class MovieLog 
{
	
	private String[] movieNames;
	private int[] runtimes;
	
	public MovieLog()
	{
		movieNames = new String[0];
		runtimes = new int[0];
	}
	
	public void addLog(String name, int runtime)
	{
		//Should add a movie of this name and runtime to the log
		String[] tempNames = new String[movieNames.length + 1];
		for(int i = 0; i < movieNames.length; i++)
		{
			tempNames[i] = movieNames[i];
		}
		tempNames[tempNames.length - 1] = name;
		movieNames = tempNames;
		
		//Add runtime
		int[] tempRuntimes = new int[runtimes.length + 1];
		for(int i = 0; i < runtimes.length; i++)
		{
			tempRuntimes[i] = runtimes[i];
		}
		tempRuntimes[tempRuntimes.length - 1] = runtime;
		runtimes = tempRuntimes;
	}
	
	public void printLogs()
	{
		for(int i = 0; i < movieNames.length; i++)
		{
			System.out.println(movieNames[i] + ": " + runtimes[i]);
		}
	}

	public static void main(String[] args) 
	{
		MovieLog log = new MovieLog();
		log.addLog("Hello Dolly", 130);
		log.addLog("Camp Rock 2: The Final Jam", 87);
		log.printLogs();
	}

}
