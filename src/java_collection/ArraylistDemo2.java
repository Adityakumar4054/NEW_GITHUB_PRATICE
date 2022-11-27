package java_collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistDemo2 
{

	public static void main(String[] args) 
	{
		String []ar= {"dog","cat","mouse","cat"};
		ArrayList al=new ArrayList(Arrays.asList(ar));
				
		System.out.println(Arrays.toString(ar));	
		System.out.println(al);

	}

}
