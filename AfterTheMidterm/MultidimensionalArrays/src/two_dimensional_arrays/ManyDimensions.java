package two_dimensional_arrays;

public class ManyDimensions 
{

	public static void main(String[] args) 
	{
		//3D array
		int[][][] threeD = new int[5][5][5];
		
		for(int i = 0; i < threeD.length; i++)
		{
			for(int j = 0; j < threeD[i].length; j++)
			{
				for(int k = 0; k < threeD[i][j].length; k++)
				{
					System.out.print(threeD[i][j][k] + ", ");
				}
				System.out.print("\n");
			}
		}
		
		int[][][][] fourD = new int[5][5][5][5];
		int[][][][][] fiveD = new int[5][5][5][5][5];
		int[][][][][][][][][][][][][][][] idk = new int[5][5][5][5][5][5][5][5][5][5][5][5][5][5][5];
		
		idk[4][2][1][3][4][2][3][3][3][3][3][3];
		
		
	}

}
