package java_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Using_Collection_Spl_method
{

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
//		al.add(100);
//		al.add("welcome");
//		al.add(15.1);
//		al.add("a");
		al.add("n");
		al.add("m");
		al.add("z");
		al.add("a");
		
		// USING SPECIAL METHOD "ITERATOR"
		//--------------------------------
		
		//iterator()-this method is used to segrate the method like "FOR" and "FOR EACH Loop" 
//		Iterator it=al.iterator();
//		
//		while(it.hasNext())// "hasNext" method is used to show the iterator having element or not if no then false or else yes.
//		{
//			System.out.println(it.next()); //this "next" method is used to moved to the next element
//		}
		ArrayList al2=new ArrayList();
		al2.addAll(al);
		System.out.println(al2);
		
		al2.removeAll(al2);
		System.out.println(al2); 
		
		// sort -----------	COLLECTION method
		Collections.sort(al);
		System.out.println(al);
		
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
		
		// shuffling-collections
		//-----------------------
		Collections.shuffle(al);
		System.out.println("after shuffling "+al);

	}

}
