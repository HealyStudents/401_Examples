package arrays;

public class Vowels 
{
	public static void main(String[] args) 
	{
		char[] letters = {'a','e','i','o','x'};
		//Access the element in the first position
		System.out.println(letters[0]);
		//Change the value of the last element to letter 'u'
		letters[letters.length - 1] = 'u'; //letters[4] = 'u';
		
		//letters should be: [a, e, i, o, u, y]
		char[] newLetters = new char[6];
		//Copy over the old letters
		for(int i = 0; i < letters.length; i++)
		{
			newLetters[i] = letters[i];
		}
		//add y
		newLetters[5] = 'y'; 
		// An alternative: newLetters[newLetters.length - 1] = 'y';
		
		//overwrite letters with our new array
		letters = newLetters;
		
		printArray(letters);
	}
	
	public static void printArray(char[] arr)
	{
		System.out.print("[");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + ",");
		}
		System.out.println("]");
	}

}
