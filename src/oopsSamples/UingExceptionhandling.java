package oopsSamples;

import java.util.Scanner;

public class UingExceptionhandling 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		try
		{
		System.out.print("enter the first value" );
		double n1=sc.nextDouble();
		System.out.print(" enter  the second Number ");
		double n2=sc.nextDouble();
		double result=n1/n2;
		System.out.print(" result is by devide two number is = " +result);
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		finally 
		{
			sc.close();
		}
	}

}
