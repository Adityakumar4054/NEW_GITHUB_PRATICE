package JavaSamples;

import java.util.Scanner;

import org.apache.poi.hssf.record.PageBreakRecord.Break;

public class UsingWhile
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		while (num>=0)
		{
			if( num%2==0)
			{
				System.out.println(+ num + ":  is a  even number ");
				break;
			}
			else
			{
				System.out.println(+ num +"number is odd number ");
				break;
			}
		}
		System.out.println(" loop is compltete ");

	}

}
