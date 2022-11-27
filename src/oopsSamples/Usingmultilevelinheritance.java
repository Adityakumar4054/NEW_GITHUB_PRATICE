package oopsSamples;

//  MULTILEVEL INHERITANCE : (ONE CLASS TO ANOTHER CLASS THAT CLASS  IN TO ANOTHER CLASS  AS SO ON INHERITATES )
//---------------------------

class F1st
{
	public int i=10;
	public void M1()
	{
		System.out.println(" M1 method from class F1st ");
	}
}

class F2nd extends F1st
{
	@Override
	public void M1()
	{
		System.out.println(" override of M1 method from class F2nd ");
	}
}
class F3 extends F2nd
{
	public void M1()
	{
		System.out.println("override of  M1 method from class F3 ");
	}
}

public class Usingmultilevelinheritance
{

	public static void main(String[] args)
	{
		F3 obj=new F3();
		System.out.println("inteial value of i is : " + obj.i);
		obj.i=20;
		System.out.println("after modification  i  value is : " + obj.i);
		obj.M1();
	}

}
