package two_dimensional_arrays;

public class ManyDimensions 
{

	public static void main(String[] args) 
	{
		//3D array
		int[][][] threeD = new int[5][5][5];
		
		//These nested loops traverse the entire 3D array
		// We can think of a 3D array as having planes, each plane has rows, and each row has columns
		for(int i = 0; i < threeD.length; i++)
		{
			System.out.println("Plane " + i + ":");
			for(int j = 0; j < threeD[i].length; j++)
			{
				for(int k = 0; k < threeD[i][j].length; k++)
				{
					System.out.print(threeD[i][j][k] + ", ");
				}
				System.out.print("\n");
			}
		}
		
		//A four dimensional array... I'm not sure *how* we should think about this
		int[][][][] fourD = new int[5][5][5][5];
		//A five dimensional array... okay.
		int[][][][][] fiveD = new int[5][5][5][5][5];
		//A fifteen dimensional array...... ?????????? Is this useful?
		int[][][][][][][][][][][][][][][] idk = new int[5][5][5][5][5][5][5][5][5][5][5][5][5][5][5];
		
		//We can access and change this array just like any other multidimensional array.
		idk[2][1][0][3][2][1][0][2][3][4][1][2][0][1][1] = 5;
		/* In the third sublist's second sublist's first sublist's fourth sublist's 
		 * third sublist's second sublist's first sublist's third sublist's 
		 * fourth sublist's fifth sublist's second sublist's third sublist's 
		 * first sublist's second sublist, set the second value to 5. 
		 * 
		 * See? Simple. :)
		 */
	}

}
