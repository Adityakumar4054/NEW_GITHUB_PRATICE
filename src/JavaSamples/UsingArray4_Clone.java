package JavaSamples;

public class UsingArray4_Clone
{

	public static void main(String[] args) 
	{
		int[] a= {50,50,90};
		int[] b; 
		
		// syntax of "Clone mthod" --
		// "destination array = source array.clone"
		
		b=a.clone();
		
		for(int ar:b)
		{
			System.out.print(ar +" ");
		}

	}

}
