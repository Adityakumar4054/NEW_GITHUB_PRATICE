package JavaSamples;

import java.util.Scanner;

public class Using_Nestedifelse 
{

	public static void main(String[] args)
	{
		
		int sal,com,grsal;
		System.out.println("enter salary: ");
		Scanner sc=new Scanner(System.in);
		sal=sc.nextInt();
		if(sal<20000)
		{
			com=10*sal/100;
			
		}
		else if(sal>=20000 && sal<=40000)
		{
			com=20*sal/100;
		}
		else
		{
			com=30*sal/100;
		}
		grsal=sal+com;
		
		System.out.println("commision  is :" + com);
		
		System.out.println("gross salary is :" + grsal);

	}

}
