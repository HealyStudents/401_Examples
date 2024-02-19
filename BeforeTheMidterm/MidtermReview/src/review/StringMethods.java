package review;

public class StringMethods 
{

	public static void main(String[] args) 
	{
		String str = "Hello world!";
		
		//length
		System.out.println(str.length());
		
		//charAt
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(str.length()-1));
		
		//indexOf
		System.out.println(str.indexOf("o"));
		
		//equals
		String str2 = "Goodbye.";
		//compares reference, not data
		if(str == str)
			System.out.println("These are the same object!");
		if(str == str2)
			System.out.println("These are the same object!");
		if(str.equals(str2))
			System.out.println("These have the same data");
		
		//substring
		System.out.println(str.substring(4, 8));
		
		//split
		String[] tokens = str.split(" ");
		System.out.println("[" + tokens[0] + "," + tokens[1] + "]");
		
		String csv = "Bob,2,4,5,2,6,1,11";
		String[] csvTokens = csv.split(",");
		System.out.print("[");
		for(String token : csvTokens)
			System.out.print(token + ",");
		System.out.println("]");
		System.out.println(csvTokens.length);
	}

}
