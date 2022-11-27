package oopsSamples;

class ClsMethod
{
	public void swap(int i ,int j) // "void" return type.
	{
		System.out.println("inetial value is  " + i + " and " + j );
		int temp=i;
		i=j;
		j=temp;
		
		System.out.println("after swap the value first no is " + i + " , second no is " + j);
		
		
	}
	public int multi(int i,int j) // "some data type" return type.ex int, string & char etc.
	{
		return (i*j);
				
	}
}

public class UsingMethods
{

	public static void main(String[] args) 
	{
		ClsMethod obj=new ClsMethod();
		obj.swap(25, 80); // "void" return type = it will not return any value to here (only it will take values ex-25,80)
		 
		
		int res=obj.multi(50, 100); // "some data type"= it will  return any value to here to perform some operation in calling program.
		System.out.println(" the multi ply of 10 and 20 is " +obj.multi(10, 20));
		System.out.println("the multiple of 50 and 100 is " + res );		
		System.out.println("the squre of first value and second value addition is " + res*res);
	}
	

}
