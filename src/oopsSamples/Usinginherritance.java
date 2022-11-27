package oopsSamples;

class companey

// " Single inheriting " from one class to another :
//----------------------------------------

{
	public String compName;  // DATA MEMEBER
	public String compadd;   // DATA MEMEBER
	
	public companey()   // providing constructor
	{
		compName="ADITYA BIRLA";
		compadd="BERHAMPUR";
	}
	
	public void display() // FUNCTIONAL MEMEBER
	{
		// defination with method name
		System.out.println("companey name :" +compName); 
		System.out.println("companey adress :" +compadd);
	}
}

class emp extends companey // inheriting from one cls to another cls.
{
	public int empid;
	public String empName;
	public String empdesg;
	
	
	@Override // this is for method override (same method name same signature but different defination).it can be used in betn. base cls and derived cls.
	public void display()   // FUNCTIONAL MEMEBER
	{
		// differnt defination with same method name.
		//-------------------------------------------
		System.out.println("ID : "+ empid);
		System.out.println("EMPNAME : "+empName);
		System.out.println("DEG : "+empdesg);
		super.display();            // to calling the method from base  class to derived class we have to use " super " key word. 
	}
	
}

public class Usinginherritance 
{

	public static void main(String[] args) 
	{
		emp obj=new emp();    // inheritate from  base class"companey" in to derived class "emp".
		obj.empid=100;
		obj.empName="aditya";
		obj.empdesg="devop";
		obj.display();

	}

}
