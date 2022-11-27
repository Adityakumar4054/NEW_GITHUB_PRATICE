package testngdemos;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassertions 
{
  @Test
  public void f()
  {
	  // soft assertion
	  
	  System.out.println("begining....");
	  SoftAssert sa=new SoftAssert();   // we have to create a  "SoftAssert" class.
	  sa.assertTrue(true);
	  System.out.println("first test");
	  sa.assertTrue(false);
	  System.out.println("second test");
	  sa.assertTrue(true);
	  System.out.println("thierd test");
	  
	  sa.assertAll();       // to know the exact result use "assertAll".
  }
}
