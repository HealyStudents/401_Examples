package constructors;

public class Circle 
{
	private double radius;
	
	public Circle() 
	{ 
		radius = 0; 
	}
	
	public Circle(double r)
	{
		if(r >= 0)
		{
			radius = r;
		}
		else
		{
			throw new IllegalStateException();
		}
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public double area()
	{
		return Math.PI*radius*radius;
	}
	
	public double perimeter()
	{
		return Math.PI*(radius*2);
	}
	
	public String toString()
	{
		return "Circle of radius " + getRadius() + ", Area of " + area() + ", Perimeter of " + perimeter();
	}
	
	
	public static void main(String[] args) 
	{
		Circle c = new Circle();
		System.out.println(c);
	}

}
