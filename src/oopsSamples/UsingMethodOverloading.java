package oopsSamples;

class clsoverload
{
	public int add(int i ,int y)
	{
		return (i+y);
		
	}
	
	public int add(int i,int y,int z)
	{
		return (i+y+z);
		
	}
}

public class UsingMethodOverloading
{

	public static void main(String[] args)
	{
		clsoverload obj=new clsoverload();
		System.out.println("sum of 10 and 20 is " +obj.add(10,20));	
		System.out.println(" sum of 50 and 60 and 80 is " +obj.add(50, 60, 80));

	}

}
