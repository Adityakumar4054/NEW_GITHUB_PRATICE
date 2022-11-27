package oopsSamples;

import java.util.Scanner;

interface Ibankaccount // interface will have only decleration with out ay defination with out any access modifier.
{
    double getbalance(); 
    double deposite(double amt);
	boolean withdraw(double amt);
}


class savingaccount implements Ibankaccount // its inheriting from one interface to another class.
{
    private double Lbal; // we create a local balance so that can't be change that it can be used .so here given "Private " we can't change that valu in another class.
	@Override
	public double getbalance()  // for decimal value.
	{
		
		return Lbal;
	}

	@Override
	public double deposite(double damt)  // void return type so this methos is called by only it should not return any value.
	{
		return Lbal=Lbal+damt;
	}

	@Override
	public boolean withdraw( double wamt) 
	{
		if (wamt <=Lbal)
		{
			
			Lbal=Lbal-wamt;
			return true;
		}
		else
		{
			return false;
		}
		
		
	}
	
}



public class UsingInterfaceandClassInhertance
{

	public static void main(String[] args)
	{
		savingaccount obj=new savingaccount();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("inetial balance is "+ obj.getbalance());
		
		
		
		System.out.println("enter ampount to deposite :");
		double Deamt=sc.nextDouble();
		System.out.println("BALANCCE IS "+obj.deposite(Deamt)); 
//		System.out.println("after deposite balance is "+ obj.getbalance()); 
		
		
		
		System.out.println("enter ampount to withdraw :");
		double Wiamt=sc.nextDouble();
		boolean result= obj.withdraw(Wiamt);
		if(result==true)
		{
			System.out.println(" after withdrawing the balance amount is "+ obj.getbalance());
		}
		else 
		{
		    System.out.println(" u provide insufficent balance ");
		}
		
	
		
		
				
		

	}

}
