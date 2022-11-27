package oopsSamples;

import java.util.ArrayList;

public class Usingcollections 
{

	public static void main(String[] args)
	{
		// using ArrayList's method we have to create an instance of that class , so that by taking instance of that object we can access ArrayList's method
		//  Arraylist is a predefind class which contain a intance  methods.
		
		ArrayList alist=new ArrayList();
		
		// add item :
		//----------
		
		alist.add(10);
		alist.add("java");
		alist.add(false);
		
		// ArrayList converting all  type of datatype in to Object type.
//                                                          ------		
		                              
		// By displaying all data we will use for each loop.
		
		for(Object items:alist)
		{
			System.out.println("the items are : "+ items);
		}
		// size() :
		//--------
		
		System.out.println("no of  items are : "+ alist.size());
		
		// get(index):
		// -----------
		
		System.out.println("3 rd item in the collection is : "+ alist.get(2));
		
		// Add(index):
		// -----------
				
		 alist.add(2,40.2);
		 // to display the items
		 for(Object items:alist)
			{
				System.out.println("the items are : "+ items);
			}
		// remove(index):
		// -----------
		 
		 System.out.println("after delete the 2nd  item : ");
		 alist.remove(2);
		// to display the items
		 for(Object items:alist)
			{
				System.out.println("the items are : "+ items);
			}
	}

}
