package JavaSamples;

import java.util.Scanner;

public class Using_nestedifelse2
{

	public static void main(String[] args)
	{
		int TTmrk,Gainmrk,perc;
		String grade;
		System.out.println("Eneter gain mark:  ");
		Scanner sc=new Scanner(System.in);
		Gainmrk=sc.nextInt();
		System.out.println("Enetr total mark: ");
		TTmrk=sc.nextInt();
		perc= (Gainmrk*100/TTmrk);
		if(perc>=60)
		{
			grade= "1stclass";
			System.out.println("percentage is "+ perc+"%");
			System.out.println((grade));
			
		}
		else if(perc>40 && perc<60 )
		{
			grade=" 2ndclass";
			System.out.println("percentage is "+ perc+"%");
			System.out.println((grade));
		}
		else if(perc>=33 && perc<40)
		{
			grade="3rdclass";
			System.out.println("percentage is "+ perc+"%");
		    System.out.println((grade));
		}
		else
		{
			System.out.println("percentage is"+ perc+"%");
			System.out.println(" failed ");
		}
		
		

	}

}
