package constructor_examples;

public class Circle 
{
	// fields:
	// - radius: double
	private double radius;
	
	//Constructor
	public Circle(double r)
	{
		if(r >= 0)
		{
			radius = r;
		}
		else
		{
			throw new IllegalStateException("Radius must be >= 0");
		}
	}
	
	//methods:
	// + setRadius(double): void
	public void setRadius(double r)
	{
		if(r >= 0)
		{
			radius = r;
		}
		else
		{
			throw new IllegalArgumentException("Radius must be >= 0");
		}
	}
	
	// + getRadius(): double
	public double getRadius()
	{
		return radius;
	}
	
	// + area(): double
	public double area()
	{
		return  Math.pow(radius, 2) * Math.PI;
	}
	
	// + perimeter(): double
	public double perimeter()
	{
		return radius*2*Math.PI;
	}
}