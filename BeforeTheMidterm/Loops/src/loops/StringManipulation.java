package loops;

public class StringManipulation 
{
	/**
	 * A method that inverts a String (i.e. reverses its order of characters)
	 * @param s Some string.
	 * @return A new String with all the characters of s in reverse order.
	 */
	public static String invert(String s)
	{
		String inverted = "";
		for (int i = 0; i < s.length(); i++) 
		{
			inverted = s.charAt(i) + inverted;
		}
		return inverted;
	}
	
	/**
	 * This method demonstrates an alternative method of filtering out non-letter characters without using ASCII values.
	 * @param s Some string.
	 * @return A new string that has all of the characters in s that are letters.
	 */
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
		//Test our methods
		System.out.println(invert("notebook"));
		System.out.println(filterSymbols("Hello world!!!!!$"));
	}

}
