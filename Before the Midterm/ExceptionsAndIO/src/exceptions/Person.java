package exceptions;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age){
		this.name = name;
		this.age =  age;
	}
	
	public Person(String name)
	{
		this.name = name;
		this.age = 50;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString()
	{
		return name + " is " + age + " years old";
	}
	
	public static void main(String[] args)
	{
		//call first constructor
		Person p = new Person("Pat", 26);
		//call second constructor
		p = new Person("Pat");
	}
}

