package string_examples;

public class InClassExercises_January17 
{

	public static void main(String[] args) 
	{
		//1. Is this a legal declaration/initialization? Why?
		char myFavoriteCharacter = 'a'; // "a";

		//2. How would you make a string of one character, 
		// taken from the start of the string defined below?
		String city = "Pittsburgh";
		String cityFirstLetter = "" + city.charAt(0);
		// alternative: Character.toString(city.charAt(0));
		System.out.println(cityFirstLetter);

		//3. How would you calculate the length of 
		// the following string:
		String x = "Java Program";
		System.out.println(x.length());
		System.out.println("Java Program".length());
		
		//4. Given the following code, 
		//how would you convert the value of myString to an integer?

		String myString = "745.0";
		double myDouble = Double.parseDouble(myString);
		int myInteger = (int)myDouble;
	}

}
