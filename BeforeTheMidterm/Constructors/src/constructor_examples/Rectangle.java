package constructor_examples;

public class Rectangle 
{
	/*
	 * Make a Rectangle object, with two fields (sideA, sideB), 
	 * one method (area), and two constructors:
		One constructor for rectangles
		One constructor for squares
	 */
	public double sideA, sideB;
	
	public Rectangle(double sideA, double sideB)
	{
//		System.out.println("2-parameter constructor");
		this.sideA = sideA;
		this.sideB = sideB;
	}
	
	public Rectangle(double side)
	{
		this(side, side);
//		System.out.println("1-parameter constructor");
//		this.sideA = side;
//		this.sideB = side;
	}
	
	public double area()
	{
		return sideA * sideB;
	}
	
	public String toString()
	{
		return "A rectangle with sides " + sideA + " and " + sideB 
				+ ". It has an area of " + this.area(); 
	}
}
