package JavaSamples;

import java.util.Scanner;

public class Usingarray3
{

	public static void main(String[] args)
	{

		// declaring array size
		int tm;
		int[] rb = new int[5];
		// taking elementvalues from run time
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) 
		{
			System.out.print("eneter the " + (i + 1) + " value is");
			rb[i] = sc.nextInt();
		}
		// printing the value
		
		System.out.print(" rb = ");
		for (int gb : rb)
		{
			System.out.print(gb + " ");
		}
		System.out.println();

		// finding the maximam vlue

//		int max = rb[0]; // lets take
//
//		for (int i = 1; i < rb.length; i++)
//		{
//			if (rb[i] > max)
//			{
//				max = rb[i];
//			}
//		}

//		System.out.println("\n the maxm value is " + max + " out of all value");
//      By using this we will gwt decending to accending order. 		
		for(int i=0; i<5;i++)
		{
			for(int j=i+1;j<5;j++)
			{
				if(rb[i]>rb[j])
				{
//					 swap method :
//					-------------
					tm=rb[i];
					rb[i]=rb[j];
					rb[j]=tm;
					
				}
			}
		//	System.out.print(rb[i] + " ");
		}
		
		for (int i = 0; i < 5; i++) 
		{
			System.out.print(rb[i] + " ");
			
		}
	}

}
