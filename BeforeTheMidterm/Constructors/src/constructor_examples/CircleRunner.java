package constructor_examples;

public class CircleRunner {

	public static void main(String[] args) 
	{
		Circle circle = new Circle(5);
		System.out.println(circle.getRadius());
		System.out.println(circle.area());
		System.out.println(circle.perimeter());
	}

}
