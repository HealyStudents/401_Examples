package if_statements;

public class CheckPrefix 
{
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

		//A longer way of writing line 36
		//		if(aPrefix.equals(bPrefix))
		//			return true;
		//		else
		//			return false;
	}


	public static void main(String[] args) 
	{
		System.out.println(samePrefix("apple", "application"));
	}

}
