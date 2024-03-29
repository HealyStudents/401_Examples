package inheritance;

public class Rectangle 
{
	protected double width;
	protected double height;
	
	public Rectangle(double width, double height)
	{
		this.width = width;
		this.height = height;
	}
	
	public double area()
	{
		return width*height;
	}

	public double perimeter()
	{
		return 2*width + 2*height;
	}
	
	public String toString()
	{
		return "rectangle(" + width + ", " + height + ")";
	}
}

