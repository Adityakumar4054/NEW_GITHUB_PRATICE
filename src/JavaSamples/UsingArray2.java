package JavaSamples;

public class UsingArray2
{

	public static void main(String[] args) 
	{
		// Synatax of {single dimensional} array=" <DataType> [] ArrayName = new<DataType> [Size];
		

		int[] ac = new int[3];
		ac[0] = 10;
		ac[1] = 20;
		ac[2] = 30;

		ac[2] = 60;
		// (For Loop)
		// System.out.println(+ac[2]);
		System.out.print("a =  ");
		// for(int i=0; i<ac.length; i++)
		// {
		// System.out.print( ac[i] + " ");
		// }

		// For Each Loop
		// synatax - for (Dtatype variable: resouces)

		for (int yn : ac)
		{
			System.out.print(yn + " ");
		}

	}

}
