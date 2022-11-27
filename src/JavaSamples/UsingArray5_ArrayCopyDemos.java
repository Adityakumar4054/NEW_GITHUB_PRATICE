package JavaSamples;

public class UsingArray5_ArrayCopyDemos 
{

	public static void main(String[] args) 
	{
		int[] a= {40,50,62,80,90};
		int[] b= {10,20,30,60,70};
		
		System.out.print("inetially :");
		System.out.print("\n\t a= ");
		
		// for each loop:
		for(int ab: a)
		{
			System.out.print(ab +" ");
		}
		
		System.out.print("\n\t b= ");
		
		// for loop:
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
		
		// syntax of ArrayCopy is :
        // System.arraycopy(sourceArray.sourceindex.destinationarray.destinationindex.No of element copy);
		
		System.arraycopy(a, 2, b, 1, 3);
		
		System.out.print("\nafter copying : ");
		
		System.out.print("\n\t a= ");
		for(int ab: a)
		{
			System.out.print(ab +" ");
		}
		
		System.out.print("\n\t b= ");
		
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
		
	}

}
