package JavaSamples;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

import net.bytebuddy.implementation.EqualsMethod;

public class Pratice_Personal
{

	public static void main(String[] args)
	{
		boolean fg =true; 
		/*
		 * Scanner sc=new Scanner(System.in);
		 * System.out.println("enter the 1st number"); int fst=sc.nextInt();
		 * System.out.println("Enter the 2nd number"); int snd=sc.nextInt();
		 * System.out.println("Enter the 3rd number"); int trd=sc.nextInt();
		 * 
		 * int Fcube=fst*fst*fst; int Scube=snd*snd*snd; int Tcube=trd*trd*trd;
		 * 
		 * int som=Fcube+Scube+Tcube;
		 * 
		 * System.out.println("the cube of 1st is "+ Fcube);
		 * System.out.println("the cube of 1st is "+Scube );
		 * System.out.println("the cube of 1st is "+Tcube);
		 * 
		 * System.out.println("the sum of each cbe number is: "+som );
		 */
		// 1.this is for reverse number-
		// -------------------------------
		/*
		 * Scanner sc=new Scanner(System.in); System.out.println(" Enter the number ");
		 * int num=sc.nextInt();
		 * 
		 * int rev=0; while (num!=0) { rev=rev*10+ num%10; // % means last part of the
		 * remaindr num=num/10; // "/" means the the rest value }
		 * 
		 * System.out.println("the reverse number of "+ rev);
		 */
		// 2.1 this is for reverse string
		// ---------------------------
		/*
		 * Scanner sc =new Scanner(System.in);
		 * System.out.println("enter the string : "); String wd=sc.nextLine(); String
		 * rev="";
		 */

		/*
		 * int rev=wd.length(); String rv="";
		 * 
		 * for(int i=wd.length()-1;i>=0; i--) { rv=rv+wd.charAt(i) ; }
		 */
		// 2.2 using array method
		// --------------------
		/*
		 * char[] a=wd.toCharArray(); int ary = a.length; for(int i=ary-1;i>=0;i--) {
		 * rev=rev+a[i]; }
		 * 
		 * 
		 * System.out.println("the reverse number of value is "+ rev);
		 */
		// 3.Palindrome = it means the digits are reverse example 16461 Palindrome or
		// not
		/*
		 * -----------------------------------------------------------------------------
		 * - Scanner sc=new Scanner(System.in);
		 * System.out.println("plese enter the number : "); int num=sc.nextInt(); int
		 * orgnum=num; int rev=0;
		 * 
		 * while(num!=0) { rev=rev*10+num%10; num=num/10; } if(orgnum==rev) {
		 * System.out.println("the" + orgnum + " is a palindrome number " ); } else {
		 * System.out.println("the " + rev + " is  not a palindrome number  "); }
		 */
		// 4.To identify a palindrome string or not
		// -------------------------------------------
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println(" eneter the string ");
//		String wd = sc.nextLine();
//		String org_wd = wd;
//		int wdl = wd.length();// this is a string a method so used "Length()" method.
//		String rev = "";
//		for (int i = wdl - 1; i >= 0; i--) 
//		{
//			rev = rev + wd.charAt(i);
//		}
//		if (org_wd.equals(rev))
//		{
//			System.out.println("the given string " + org_wd + " is a palindrome");
//		} else 
//		{
//			System.out.println("the " + rev + " is not a palindrome ");
//		}
		 
		// 5.To find out the number of odd number and number of even number
		// ---------------------------------------------------------------------

		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("Enetr the number : "); int num = sc.nextInt();
		 * 
		 * int odd_num = 0; int evn_num = 0;
		 * 
		 * while (num > 0)
		 * 
		 * { int remnd = num % 10;
		 * 
		 * if (remnd % 2 == 0) { evn_num++; } else { odd_num++; } num = num / 10;
		 * 
		 * }
		 * 
		 * System.out.println("the number of even number is " + evn_num);
		 * System.out.println("the number of odd number is " + odd_num);
		 */

		// 6. The some of numbers( 1 to 100 number add)
		// ----------------------
		/*
		 * int s=0; int i=1; while(i<=100) { s=s+i; i=i+1; }
		 * 
		 * System.out.println("the sum of 1 to 100 number is " +s);
		 */
		// 6.1 the sum of given number is
		// -------------------------------
		/*
		 * // int m=0; // int n=263546; // while(n>0) // { // int rmd=n%10; // m=m+rmd;
		 * // n=n/10; // } // System.out.println("the sum of number is " +m);
		 */

		// 6.2 Febocano program
		// ..........................
		// ex=0 1 1 2 3 5 8 13 21 etc............

//		int n1 = 0, n2 = 1, sum = 0;
//		for (int i = 2; i <= 10; i++) {
//			sum = n1 + n2;
//			System.out.print(" " + sum);
//			n1 = n2;
//			n2 = sum;
//		}
		// 7. Random value have to create
		// --------------------------------

//		String [] nm= {"adi","ajit","Raju","Aju"};
//		System.out.println(nm[new Random().nextInt(nm.length)]);

		//8. Find sum element in array
		// ----------------------------
//		int a[] = { 2, 5, 6, 4, 15 , 2, 10 };
//		int sum = 0;
//		int ln = a.length;// this is a  array method so used "length" only. 
////		for(int i=0; i<ln;i++)
////		{
////			sum=sum+a[i];
////			
////		}
////		System.out.println(sum);
//		
//		for(int su:a)
//		{
//			sum=sum+su;
//		}
//		System.out.println(sum);
		
		//9. To segrigate the even number and odd number
		//---------------------------------------------
//		int [] a= {5,3,8,26,9,2,21,33};
//		System.out.println("these all number are even");
//		for(int i=0;i<a.length; i++)
//		{
//			
//			if(a[i]%2==0)
//				
//			{
//				
//				System.out.print("  "+a[i]);
//			}
//			
//			
//		}
//		System.out.println();
//		System.out.println("these all numbers are odd number");
//		for (int k=0;k<a.length;k++)
//		{
//			if (a[k]%2!=0)
//				
//				{
//					
//					System.out.print("  "+a[k]);
//				}
//		}
		//9.1 To varify the two arrars are equal or not
		//-------------------------------------------
//		
//		int []a= {1,2,3,4,5};
//		int []b= {1,2,3,10,5};
//		boolean status =Arrays.equals(a,b); // we used to compare two method "Arrays.equals("first object","second object");
//		if (status==true)
//		{
//			System.out.println("the arrays are equal ");
//		}
//		else 
//		{
//			System.out.println("not equal ");
//		}
        
		// 10.To identify the missing number in array.
		//-------------------------------------------
//		int []a= {1,2,5,6,8,7,3,9,10};
//		
//		int sum1=0;
//		
//		for (int i=0;i<a.length;i++)
//		{
//			sum1=sum1+a[i];
//		}
//		
//		System.out.println("The sum of all number is "+sum1);
//		int sum2=0;
//		
//		for (int k=1;k<=10;k++)
//		{
//			sum2=sum2+k;
//		}
//		int ms=sum2-sum1;
//		
//		System.out.println("The missing number is "+(ms));
		
//		//11.finding out the  sccending and  decending number
		//---------------------------------------------------
//		int [] a=new int [5];
//		Scanner sc=new Scanner(System.in);
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println("print the " +(i+1)+ " value :");
//			a[i]=sc.nextInt();
//			
//		}
//		System.out.println();
		
//		for(int ab:a)
//		{
//			System.out.print(ab+ " ");
//		}
//		
//		int dm=0;
//		for (int i=0;i<a.length;i++)
//		{
//			for (int j=i+1;j<a.length;j++)
//			{
//				if (a[i]>a[j])
//				{
//					dm=a[i];
//					a[i]=a[j];
//					a[j]=dm;
//					
//				}
//			}
//		}
//		System.out.println();
//		for (int i=0;i<a.length;i++)
//		{
//			System.out.print(a[i] +",");
//		}
//	
		//10. To identify  the duplicate value
		//-----------------------------------
//		Object [] ar= {"aditya","ajit","anil","32","anil"};
//		for(int i= 0;i<ar.length;i++)
//		{
//			for(int j=i+1; j<ar.length;j++)
//			{
//			   if(ar[i]==ar[j])
//			   {
//				   System.out.println("this is duplicate value "+ar[i]);
//			   }
//			}
//		}
	//10.1 "HashSet"- This method is used to identify the duplicate value. this mehtod belongs to collection class
		//------------------------------------------------------------------------------------------------------
		
		
//		Object [] ar={"aditya","ajit","anil","32","anil"};
//		
//		HashSet ln=new HashSet();
//		
//		for(Object l:ar)
//		{
//		   // System.out.println( ln.add(l));
//			if(ln.add(l)==false)
//			{
//				fg=false;
//			System.out.println("the value is duplicate-" +l);
//			}
//		}
//		
//		if (fg==true)
//		{
//			System.out.println("there is no duplicate value");
//		}
//		
	//	11. Searching an element in array
		//----------------------------------
//         Scanner sc=new Scanner(System.in);
//         System.out.println("ENETR HOW MANY WORDS U WANT : ");
//         int NW=sc.nextInt();
//         
//         String [] ar=new String [NW];
//         for(int i =0; i<ar.length; i++)
//         {
//        	System.out.println("Please entre the names : ");
//        	 ar[i]=sc.next();
//         }
//        	
//         System.out.println("which name index position u want : ");
//         String Ni=sc.next();
//         
//         for (int j=0; j<ar.length;j++)
//         {
//        	// System.out.println(ar[j]);
//        	 if(ar[j].equals(Ni))
//        	 {
//        		 System.out.println("the name position is identified : " +j);
//        	 }
//         }
		
		//12.sort Elements in Array Using Built-in Methods
		//---------------------------------------------------
	//	int []a= {20,30,50,60,56,2,5};
		// to represent the all array value in single sort. 
//		System.out.println(Arrays.toString(a));
//		//this "Arrays.parallelSort(array name)" is used to sort the element.
//		Arrays.parallelSort(a);
//		//this "Arrays.sort(array name)" is used to sort the element.
//		Arrays.sort(a);
//		System.out.println(Arrays.toString(a));
		
		//12.1 reverse order
		//---------------------
//		Integer a[]= {20,30,50,60,56,2,5};
//		Arrays.sort(a,Collections.reverseOrder());
//		System.out.println(Arrays.toString(a));
//		System.out.println(a.length);
//		System.out.println(a[a.length-1]);
		
		//13.remove junk from the string
		//-----------------------------------
//	    String st="(&@$%$^%#$#$@ Aditya ";
//	    // here we used "replacedall option " sysntex=datatype variable Name =previous variable Name.replacedall("[which thing wants to constant]"),"instesd of resp of the part plart replace to given value");
//	    String  s= st.replaceAll("[^a-zA-Z0-9@]", "");
//	    System.out.println(s);
//	    
	  //13.remove white spaces from the string
	  //-----------------------------------
//	    String st="aditya anil ajit";
//	    // here instead of space we used "\\s" to reomove
//	   String m= st.replaceAll("\\s","-");
//	   System.out.println(m); 
		
		// how to count Occurrences of a character in a string
		//-----------------------------------------------------
//		String st="aditya kumar das";
//		int s=st.length();
//		System.out.println(s);
//		String rs=st.replaceAll("\\s", "");
//		int rs2=rs.length();
//		System.out.println("after remove the space"+rs2);
//		String re3=rs.replace("a", "");
//		System.out.println(re3);
//		int re1=re3.length();
//		int count =s-re1;
//		System.out.println("the number of character are missing is"+count);
//		
		for (String t: args) 
		{
		System.out.println(t);
	    }
//		
		
		
		
		
	}

}
