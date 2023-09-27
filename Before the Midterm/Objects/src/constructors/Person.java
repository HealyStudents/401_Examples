package constructors;

public class Person 
{
	private String name;
	
	public Person(String name)
	{
		if(name == null) throw new IllegalStateException();
		this.name = name;
	}
}
