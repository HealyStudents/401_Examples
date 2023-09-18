package loops;

public class Staircase {
	public static void main(String[] args) {
		String word = "Computer Science";
		for(int i=0; i<word.length(); i++){
			for(int j=0; j<i; j++){
				System.out.print(" ");
			}
			System.out.println(word.charAt(i));
		}
	}

}
