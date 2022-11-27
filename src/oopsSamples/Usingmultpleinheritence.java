package oopsSamples;

import java.util.Scanner;

public class Usingmultpleinheritence
{

	public static void main(String[] args)
	{
		Clasfunction obj2=new Clasfunction();
		System.out.println(" two number of add is " +obj2.add(13, 25));
		System.out.println(" two number of multiple  is "+ obj2.multipication(25, 56)) ;
		
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter the string ");
		String rev=sc.nextLine();
		System.out.println(" the reverse of given string is "+ obj2.Stringreverse(rev));
		
		System.out.println("  the mail id  is : ");
	    String id=sc.nextLine();
		System.out.println(" part of  the mail id  is  :" + obj2.grtmailid(id));

	}

}
