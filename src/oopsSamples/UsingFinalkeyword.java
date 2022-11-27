package oopsSamples;


class F1
{
	public  int i=10; // we are convrting the i value in final key word.
	public void M1()
	{
		System.out.println(" M1 method from class F1 ");
	}
}

 class F2 extends F1 //we are convrting the F2 class in final key word class.
{
	@Override
	public  void M1() // we are convrting the M1 method in final key word method.
	{
		System.out.println(" override of M1 method from class F2 ");
	}
}
//class F3 extends F2 // error came due to convert the F2 class in final key word class ,so that we cant inheritate the F2 class .
//{
//	// error came due to convert the M1 method in final key word method ,so that we cant inheritate the M1 method .
////	public void M1()
////	{
////		System.out.println("override of  M1 method from class F3 ");
////	}
//}

public class UsingFinalkeyword
{

	public static void main(String[] args)
	{
		F2 obj=new F2();
		System.out.println("inteial value of i is : " + obj.i);
		// error came due to convert the " i " value as a final key word ,so that we cant inheritate the " i " value.
//		obj.i=20;
//		System.out.println("after modification  i  value is : " + obj.i);
		obj.M1();
	} 

}
