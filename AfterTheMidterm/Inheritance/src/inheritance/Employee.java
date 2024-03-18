package inheritance;

public class Employee extends Person
{
	private double salary;
	
	public double getSalary()
	{
		return salary;
	}
	
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	
	public static void main(String[] args) 
	{
		Employee paul = new Employee();
		paul.setName("Paul");
		paul.setSalary(20);
		
		paul.introduceMyself();
	}

	@Override
	public void introduceMyself() 
	{
		System.out.println("Hello my name is " + this.name + ". I am tired.");
	}

}
