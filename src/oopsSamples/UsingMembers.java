package oopsSamples;

class samples  // User defind class created.

{  // [ This two are Data member] :
	
	public int i=10;  // this is called "instance variable" because here we  are not written static.
	
	public static int s=20;  // This is called "static variable" because here we written static.  
	

   // [This two are Functional member] :
	
	public int getSquare(int i)   // this is called "instance Method" because here we  are not written static.
	{
		return (i*i);
	}
	
	public static double getpai()   // This is called "static Method" because here we written static.
	{
		return (3.14);
	}
}



public class UsingMembers
{

	public static void main(String[] args)
	{
		// Static variable & Static method syntax is "classname.memberName "
		
		System.out.println("value of S : " + samples.s); //We are calling a static variable " FOR THAT WE NO NEED TO CREATE OBJECT " .We call directly by using class Name and variable name.
		System.out.println("the 2pai is " + 2*samples.getpai());  // here we used"classname.Method name"
		
		
		// for instance variable and instance method we have to create an "intance Object" so that we can so that we can call instance variable and instance method .
		samples obj=new samples();	// We created a object
		
		// instance  variable & Instance method syntax is " ObjectName.MemberName "
		
		System.out.println(" the i is" + obj.i); // here we used"INSTNCE OBJECT NAME AND VARIABLE NAME"
		
		System.out.println(" the square of 5 is" + obj.getSquare(5));  //here we used"INSTNCE OBJECT NAME AND METHOD NAME"
		

	}
	

}
