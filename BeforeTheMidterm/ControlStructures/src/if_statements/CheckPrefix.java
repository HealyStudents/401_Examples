package if_statements;

public class CheckPrefix 
{
	/**
	 * This method, and its many comments, demonstrate a few ways of checking if two strings have the same 3-character prefix
	 * 
	 * @param strA some string
	 * @param strB some second string
	 * @return true if the two strings begin with the same three characters, false otherwise.
	 */
	public static boolean samePrefix(String strA, String strB)
	{
		//Bad and Ugly way of doing it
		//		if(strA.charAt(0) == strB.charAt(0))
		//		{
		//			if(strA.charAt(1) == strB.charAt(1))
		//			{
		//				if(strA.charAt(2) == strB.charAt(2))
		//				{
		//					return true;
		//				}
		//
		//			}
		//		}
		//		
		//		return false;

		//Bad and not ugly way of doing it
		//		if(strA.charAt(0) != strB.charAt(0))
		//			return false;
		//		
		//		if(strA.charAt(1) != strB.charAt(1))
		//			return false;
		//		
		//		if(strA.charAt(2) != strB.charAt(2))
		//			return false;
		//		
		//		return true;

		//A substring way of doing it
		String aPrefix = strA.substring(0, 3);
		String bPrefix = strB.substring(0, 3);
		return aPrefix.equals(bPrefix);

		//A longer way of writing that return statement
		//		if(aPrefix.equals(bPrefix))
		//			return true;
		//		else
		//			return false;
	}


	public static void main(String[] args) 
	{
		//Test our method
		System.out.println(samePrefix("apple", "application"));
	}

}
