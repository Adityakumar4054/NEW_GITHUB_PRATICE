package oopsSamples;

import java.sql.Date;

class employee
{
	// this is instance memeber :
	public int empid;  // instance variable
	public String ename; // instance variable
	public Date doj;
	
	public employee() // we are creating our own constroctur with " zero " argument.
    {
		empid=111;
		ename="aditya";
	    doj=new Date(0);
	}
	public employee(int id ,String name ) //we are creating our own constroctur with some  arguments.
	{
		empid=id;
		ename=name;
		doj=new Date(0);
	}
	
	public void display() //  instance Method with void return type ( it will not retun any value ,only we can call this method in main class))
	{
		System.out.println("ID :"+ empid);
		System.out.println("NAME :" + ename);
		System.out.println("DOJ :" + doj);
		System.out.println("*******************");
	}
	
}

public class Usingcontructor
{

	public static void main(String[] args) 
	{
		// for instance we have to create an instance of a class is called object.


		employee obj=new employee();
		// ( insted of this we can create own constroctur whic is  mention in above.)
//		
//		obj.empid=111;       //( here we are providing the value to the display mthod) 
//		obj.ename="aditya";  //( here we are providing the value to the display mthod)
//      obj.doj= new Date(0);
		obj.display();       // wer are calling to the " display() " method .
//		
////    obj.empid=112;
////    obj.ename="ajit";
//	//  obj.doj= new Date(0);
//		obj.display(); 
		
		employee e=new employee();//	we are given  our own constroctur with " zero " argument.
		e.empid=113;
		e.ename="aju";
        e.doj= new Date(0);
 		e.display(); 
		
 		employee e1=new employee(207,"raja");// 	we are given  our own constroctur with some  argument.
 		e1.display();

	}

}
