package JavaSamples;

public class UsingArray1
{

	public static void main(String[] args)
	{
		int [] ar= {10,20,30,50,80};  //decleration and initation in single line.
		
		System.out.println(" 3rd element of arrayis " + ar[2]);
		
		
		
		System.out.println(" 4th element of array " + ar[4]);
		
		ar[4]=300;
		
		System.out.println(" 4th element of array after modify " + ar[4]);
		
	//	ar[10]=2000;  // ERROR will come= "ArrayIndexOutOfBoundsException" by this out of LENGTH .

	}

}
