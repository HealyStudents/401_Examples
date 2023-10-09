package exceptions;

public class JellybeanJar
{
	private int beans;

	public JellybeanJar(int initialBeans)
	{
		if(initialBeans > 0)
			beans = initialBeans;
		else if(initialBeans == 0)
			throw new IllegalArgumentException("Not enough beans!");
		else
			throw new IllegalArgumentException("It's impossible to have negative beans.");
	}

	public String toString()
	{
		return "This is a jar of " + beans + " jellybeans.";
	}

	public static void main(String[] args)
	{
		JellybeanJar jar = new JellybeanJar(0);
		System.out.println(jar);
	}
}
