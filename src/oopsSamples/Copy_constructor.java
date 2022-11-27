package oopsSamples;
class A 
{
	int a;
	String b;
	
	A (int num,String nam) // parameterised constructor
	{
		a=num;
		b=nam;
		System.out.println(a+" "+b);
	}
	A(A ref) // copy constructor
	{
		a=ref.a;
		b=ref.b;
		System.out.println(a+" "+b);
		
	}
	
}


public class Copy_constructor
{

	public static void main(String[] args) 
	{
		A re=new A(12, "aditya");
        A re2=new A (re); // copy the details from one object to the other.
	}

}
