package recursion;

public class SumOfDigits {

	public static int sumOfDigitsIterative(int number) 
	{
		int sum = 0;
		while(number > 0){
			sum += number % 10;
			number /= 10;
		}
		return sum;
	}

	public static int sumOfDigitsRecursive(int number)
	{
		//solve the sub-problem
		// break up our number into two numbers: the last digit and the rest
		//longer way, string-based solution
		//int lastDigit = Integer.parseInt("" + ("" + number).charAt(("" + number).length() - 1));
		int lastDigit = number % 10;
		number = number / 10;
		
		//base case
		if(number == 0)
			return lastDigit;
		
		//recursive case 
		return lastDigit + sumOfDigitsRecursive(number);
	}

	public static void main(String[] args) 
	{
//		System.out.println(sumOfDigitsIterative(23124));
//		System.out.println(sumOfDigitsRecursive(23124));
		System.out.println(sumOfDigitsRecursive(2578));
	}

}
