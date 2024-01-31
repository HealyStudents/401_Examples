package loops;

public class StringManipulation 
{
	public static String invert(String s)
	{
		String inverted = "";
		for (int i = 0; i < s.length(); i++) 
		{
			inverted = s.charAt(i) + inverted;
		}
		return inverted;
	}
	
	public static String filterSymbols(String s)
	{
		String validCharacters = 
			"abcdefghijklmnopqrstuvwxyzABCDEFGHYJKLMNOPQRSTUVWXYZ";
		if(s == null) return null;
		String filtered = "";
		for(int i=0;i<s.length();i++){
			if(validCharacters.indexOf(s.charAt(i)) != -1 ){
				filtered += s.charAt(i);
			}
		}
		return filtered;
	}



	public static void main(String[] args) 
	{
		System.out.println(invert("notebook"));
		System.out.println(filterSymbols("Hello world!!!!!$"));
	}

}
