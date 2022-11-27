package JavaSamples;

import java.util.Scanner;

public class PrimeNumber
{

	public static void main(String[] args)
	{
		// # it is for prime number given by the user
//	     --------------------------------------------
		
		int no;
		int temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number : " );
		no=sc.nextInt();
		
		for (int i=2 ;i<=no-1;i++)
		{
			if(no%i==0)
			{
				temp=temp+1;
			}
		}
		
		if(temp==0)
		{
			System.out.println(+ no + " is  prime number");
		}
		else
		{
			System.out.println(+ no + "  is  not prime number ");
		}
		
		// # it is for prime number for certain to certain :
//		---------------------------------------------------
//		
//		int temp=0;
////	
//		for(int i=1;i<=20;i++)
//		{
//			for(int j=2;j<=i-1;j++)
//			{
//				if(i%j==0)
//				{
//					temp=temp+1;
//				}
////				
//			}
//			if(temp==0)
//			{
//				System.out.println(i);
//			}
//			else
//			{
//				temp=0;
//			}
//		}

	}

}
