package constructor_examples;

/**
 * This code demonstrates using our Rectangle class.
 */
public class RectangleRunner 
{

	public static void main(String[] args) 
	{
		System.out.println("Initialize rectangle:");
		Rectangle rect = new Rectangle(5, 4);
		System.out.println(rect);
		System.out.println();
		
		System.out.println("Initialize square:");
		Rectangle square = new Rectangle(5);
		System.out.println(square);
		
	}

}
