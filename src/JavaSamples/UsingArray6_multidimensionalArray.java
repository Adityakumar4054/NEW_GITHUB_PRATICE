package JavaSamples;

public class UsingArray6_multidimensionalArray 
{

	public static void main(String[] args) 
	{
		// Synatax of multi dimensional Array :
		// Datatype[][] ArrayName=new Datatype [Rowsize][ColoumnSize];

		// Ex: int[][] ar=new int[5][3];------ ((5 Row & 3Coloumn), Decleration)
		// ar[0][0]=20; -------------------( inetialization of value)
		// ar[0][1]=30;
		// ar[0][2]=40;
		// so on...........
		

		// (instead of using this we can write in one line decleration and
		// inetialization)

		int i;
		int j;

		int[][] a = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };

		for (i = 0; i < 3; i++) // iterate between each row
		{
			for (j = 0; j < 3; j++) // iterate between each coloumn
			{
				System.out.print(a[i][j] + " ");
			
			}
			System.out.println();
		}

	}

}
