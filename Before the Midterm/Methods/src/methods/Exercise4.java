package methods;

public class Exercise4 
{

	public static void main(String[] args) 
	{
		System.out.println(initials("pat healy"));
	}
	
	public static String initials(String fullName)
	{
		String initials = "";
		
		//get first initial
		char firstInitial = fullName.charAt(0);
		//get last initial
		int indexLast = fullName.indexOf(' ') + 1;
		char lastInitial = fullName.charAt(indexLast);
		
		initials = "" + firstInitial + lastInitial;
		initials = initials.toUpperCase();
		return initials;
	}

}
