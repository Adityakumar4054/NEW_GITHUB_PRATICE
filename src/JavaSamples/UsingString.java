package JavaSamples;

import java.util.Scanner;

import net.bytebuddy.implementation.EqualsMethod;

public class UsingString 
{

	public static void main(String[] args)
	{
		// there wil be in 10 types of string is used for to perform sting functionality.
		
	   //  1. charAt()- used to get the charactor at specified index number.
//		
//		String st="javaprogram";
//				System.out.println(st.charAt(9));
		
//	2. indexOf()- it is used to return the index Number of specified char.
//		
		/*
		 * String sr="javaprogram"; System.out.println(sr.indexOf("g"));
		 * System.out.println(sr.indexOf("z"));// it will be return -1 (means specified
		 * char is not available) System.out.println(sr.indexOf("a",2)); // it will be
		 * start serach "a" after 2 position.
		 *///		
	//3. equals()-it is used  to get compare the two strings are equals or not ex-( j not equals J).
		
	//4. equalsIgnorecase()-it is also used to get compare between 2 string but here case won't be consider. 
//		String st1="java";
//		String st2="JAVA";
//	    String st3="java";
//	    String st4="PROGRAM";
//	    System.out.println(st1.equals(st4));
//	    System.out.println(st1.equalsIgnoreCase(st2));
//	    System.out.println(st1.equals(st3));
//	    System.out.println(st2.equalsIgnoreCase(st4));
	    // generally in case of Gmail log in process we used  
	    // such as "eqals" and "equalsIgnorecase"
	    /* if(uername.euallignorecase.("")&& password.equall.("ABC"))
	    {
	         ________________
	          _____________
	           _______________
	    }
	     else
	    {
	     ________________
	          _____________
	           _______________
	    	
	    }*/
		
	//5. length()- it is used to identified how many charater in the given sgtring.
		String st1="javaprogram";
		String st2="aditya kumar das";
		String st3= "123456";
		System.out.println(st1.length());
		System.out.println(st2.length());
		System.out.println(st3.length());
	    
		
	    
//5.1.  endswith()-To identify whether the specified string is ends with the specifies sequence or not .
	    // Scanner sc = new Scanner(System.in);
//	    System.out.print("please enter the gmail :");
//	    String Gmail=sc.next();
//	    if (Gmail.endsWith("gmail.com")||Gmail.endsWith("yahoo.com"))
//	    {
//	    	System.out.println("you entered valid adress");
//	    }
//	    else
//	    {
//	    	System.out.println("please eneter valid adress");
//	    }
		
//   6. Contains()-it used to varify whether the given string is contains scpecified charater sequence or not.
//		String str="javaprogram";
//		System.out.println(str.contains("pr"));
//		System.out.println(str.contains("x"));
//		System.out.println(str.contains("pr"));
//		System.out.println(str.contains("j"));
//		System.out.println(str.contains("pr"));
//		System.out.println(str.contains("pm"));
//		
		
//	7. trim()-it is used to remove the unwanted space from left or right side of the string &
//  8.  concat()-it is used to conncet the 2 string.
//		String st="java    ";
//		String St1="   program";
//		System.out.println(st.concat(St1));
//		
//		System.out.println(st.trim().concat(St1.trim())); 
		
//   9. split()- it is generally used to devide the string in different string based on the expression.
		
 //    	String st="adityakumardas4054@gmail.com";         // this string is having some return method 
//        Scanner sc=new Scanner(System.in);
//        System.out.println("please enter the mail id : ");
//        String st1=sc.nextLine();
//		String [] word=st1.split("@");             // string array method is used to return the value.
//		
//		System.out.println( "the NO OF words are:  " + word.length);
//		
//		System.out.println("mail id of : " + word[0]);
//		
		// for display that all word we have to go thrue for loop ya for each loop
		
	//	for loop
//		for(int i=0;i<word.length;i++)
//		{
//			System.out.println(word[i]);   // we will get the word by using string array method
//			
//		}
//		// for each loop
//		for (String wd: word)
//		{
//			System.out.println(wd);
//		}
//		
//	10.	sbustring()-it is used to get the part of the string from the main string .
		
	//10.1 substring(beginIndex)-it si used to get the part of the string beginindex position  up to the end.
				
//		String st2="javaprogram";
//		System.out.println(st2.substring(5));
//		
//  10.2  sbustring(beginIndex,endIndex)-it is used to get the part of the string starting from beginIndex position to up to before end index.
//		System.out.println(st2.substring(4, 10));
//		
//  11. replace- it is used to replace the charater from one char to another.
//		-------
//		String srt="adityakumardas" ;
//		System.out.println(srt.replace("a", "x"));
		
//	12. this is for Reverse string method :
//	    --------------------------------
		
//		String nm="95";
//		System.out.println(nm.length());
//        String rev="";
//		for(int i=nm.length()-1; i>=0; i--)  // for reverse
//		{
//			rev=rev+nm.charAt(i);
//		}
//		System.out.println(rev);
//		
//    OR run time taking value :
//    ----------------------------       
		
//	Scanner sc = new Scanner(System.in);
//	String rev1 = "";
//	System.out.println("enter value : ");
//	String RV = sc.nextLine();
//
//	for (int i = RV.length()-1; i >= 0; i--) // for reverse
//	{
//		rev1 = rev1 + RV.charAt(i);
//	}
//	System.out.println(rev1);
		
//		or Taking of set of data ( PENDING)
//		---------------------------
//		Scanner sc1=new Scanner(System.in);
//		System.out.println("Enter the string values : ");
//		String wd=sc1.nextLine();
//		
//		String [] wod=wd.split(" ");
//		System.out.println(wod.length());
//		String rv="";
//		
//		for(int i=0;i<=wod.length;i++)
//		{
//			String WOD=wod[i];
//			String revword="";
//			for(int m=WOD.length()-1;m>=0;m--)
//			{
//				revword=revword+WOD.charAt(m);
//			}
//			rv=rv+revword+"";
//		}
//		
//		System.out.println(rv);
		
	/*
	 * String str="aditya"; String str2= str.concat(" kumar"); // concat is used to
	 * joint and there is similar type of object so we have to make diffrent object
	 * to store the new value. System.out.println(str2);
	 */
	/*
	 * String str1= "same"; String str2="Same";
	 * 
	 * System.out.println(str1.equals(str2));
	 */
	
		
	    
	}

}
