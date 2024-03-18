package inheritance;

public class Square extends Rectangle 
{
	public Square(double side)
	{
		super(side, side);
	}
	
	public String toString()
	{
		return "Square(" + this.width + ")";
	}

	public static void main(String[] args) 
	{
		Square s = new Square(123.2);
		System.out.println(s.area());
		System.out.println(s.perimeter());
		
		System.out.println(s);
	}

}