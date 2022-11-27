package JavaSamples;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Using_BubbleShort
{

	public static void main(String[] args)
	{
		int [] a= {2,3,5,4,1};
		// "Arrays.toString" this method is used to display the all array valu in single sort.
		System.out.println("to before bubble sort"+ Arrays.toString(a));
		
		// to bubble sort means to small to big.
		//----------------------------------------
        int big=a[0]; 
        int temp=0;
		for(int i=0; i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("after sorting "+Arrays.toString(a));
	}

}
