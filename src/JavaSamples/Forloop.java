package JavaSamples;

public class Forloop
{

	public static void main(String[] args)
	{
//		for(int i=1; i<=20;i++)
//		{
//			if(i%2!=0)
//			{
//				System.out.println("Odd number is : " + i);
//			}
//			else
//			{
//				System.out.println("even number is : " +i);
//			}
//		}
		int count=0;
		int n=23;
		for (int i=2; i<=n-1;i++)
		{
			if (n%i!=0)
			{
				count=count+1;
			}
		}
		if (count==0)
		{
			System.out.println(n+ " is not a prime number ");
		}
		else 
		{
			System.out.println(n+ " is  prime  numebr ");
		}

	}

}
