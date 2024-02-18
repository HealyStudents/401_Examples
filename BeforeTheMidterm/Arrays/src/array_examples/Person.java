package array_examples;

/**
 * A Person object. This example was created in class to demonstrate overloading constructors.
 */
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
		this(name); //We can call a different constructor in the first line of any constructor. We call the one on line 11 here.
		this.age = age;
	}
	
	public Person(String name, int age, String favoriteColor)
	{
		this(name, age); //Calls the constructor on line 20 here.
		this.favoriteColor = favoriteColor;
	}
	
	public static void main(String[] args)
	{
		Person p = new Person("Paul");
		Person j = new Person(null);
	}
	
}
