package methods;

public class Exercise5 
{

	public static void main(String[] args) 
	{
		System.out.println(convertTime("12:02"));
	}
	
	public static String convertTime(String militaryTime)
	{
		//Input looks like "20:04"
		String twelveTime = "";
		
		//Find hours
		String hoursString = "" + militaryTime.charAt(0) + militaryTime.charAt(1);
		int hours = Integer.parseInt(hoursString);
		
		//Convert hours 
		hours = hours % 12;
		//hours %= 12; //This does the same thing!
		
		//Find minutes
		String minutesString = "" + militaryTime.charAt(3) + militaryTime.charAt(4);
		
		//Concatenate everything together
		twelveTime = "" + hours + ":" + minutesString;
		
		return twelveTime;
	}

}
