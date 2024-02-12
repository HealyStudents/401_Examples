package array_examples;

public class Person 
{
	private String name, favoriteColor;
	private int age;
	
	public Person(String name)
	{
		if(name == null)
		{
			throw new IllegalStateException("A name cannot be null and your name was " + name);
		}
		this.name = name;
	}
	
	public Person(String name, int age)
	{
		this(name);
		this.age = age;
	}
	
	public Person(String name, int age, String favoriteColor)
	{
		this(name, age);
		this.favoriteColor = favoriteColor;
	}
	
	public static void main(String[] args)
	{
		Person p = new Person("Paul");
		Person j = new Person(null);
	}
	
}
