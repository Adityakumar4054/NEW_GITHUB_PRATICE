package JavaSamples;

import java.util.Scanner;

public class Usingi_ifelse
{

	public static void main(String[] args) 
	{

		int pwd;
		System.out.println("enter password:  ");
		Scanner sc=new Scanner(System.in);
		pwd=sc.nextInt();
		if(pwd==2730)
		{
			System.out.println("hello aditya");
		}
		else
		{
			System.out.println("u given wrong password");
		}
		
		

	}

}
