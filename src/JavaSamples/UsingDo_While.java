package JavaSamples;

import java.util.Scanner;

public class UsingDo_While
{

	public static void main(String[] args)
	{
		String uid , pwd ;
	    int count=0;
	   
	   
		do 
		{
			if (count == 3) 
			{

				System.out.println("you have cross your limit please come tommrow");

				break;
			}
			if(count>0)
			{
				System.out.println("please eneter the data and  properly");
			}
			

			Scanner sc = new Scanner(System.in);
			System.out.print("enter the userid : ");
			uid = sc.nextLine();
			System.out.print("enter the password : ");
			pwd = sc.next();
			count = count + 1;
			
		} 
		while (!uid.equals("aditya") || !pwd.equals("das"));

	}

}
