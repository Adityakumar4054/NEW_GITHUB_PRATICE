package oopsSamples;

abstract class A1  //if any of the method of a class having abstract then the class  must be decleared as abstract.
{
	public void M1()
	{
       System.out.println("M1 method from A1 class");
	}
	public abstract void M2(); // here method defination is not using so method must be decleared as abstract.
	
}

class A2 extends A1
{
	@Override
	public void M2()
	{
		 System.out.println(" override of M2 method from A2 class"); // derived class must have to provide the implimention logic to the base class abstract method.
	}
	
}

public class usingAbstractclass 
{

	public static void main(String[] args) 
	{
		A2 obj=new A2();
		obj.M1();
		obj.M2();
 
	}

}
