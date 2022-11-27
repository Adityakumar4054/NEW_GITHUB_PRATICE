package JavaSamples;

import java.util.Scanner;

public class Usingswitchcase 
{

	public static void main(String[] args)
	{
		int a,b,c,ch;
		Scanner sc=new Scanner(System.in);
		System.out.println( "enter two number " );
		a=sc.nextInt();
		b=sc.nextInt();
		System.err.println(" enter your choice ");
		 ch=sc.next().charAt(0);  // to choice for +,- & * . //doubt
//		ch=sc.nextInt();

	    
		switch(ch)
			{
			case '+':
				c = a + b;
				System.out.println(" the two number calculation is : " + c );
				break;
			case '-':
				c = a - b;
				System.out.println(" the two number calculation is : " + c );
				break;
			case '*':
				c = a * b;
				System.out.println(" the two number calculation is : " + c );
				break;
			default:
				System.out.println(" u enter the wromng choice");
				
		    	  
			}

	}

}
