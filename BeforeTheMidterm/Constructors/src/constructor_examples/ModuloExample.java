package constructor_examples;

/**
 * This code demonstrates a bizarre quirk of modulo in Java -- modulo keeps the sign of the dividend! This has important implications for some of our labs...
 */
public class ModuloExample 
{

	public static void main(String[] args) 
	{
		System.out.println((-50) % 26);
	}

}
