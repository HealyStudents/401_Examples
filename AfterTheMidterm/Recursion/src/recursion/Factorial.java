package recursion;

public class Factorial {

	int factorial (int x) 
	{
		int temp;
		if(x > 1){
			temp = x * factorial(x-1);
		}
		else{
			temp = 1;
		}
		return temp;
	}

}
