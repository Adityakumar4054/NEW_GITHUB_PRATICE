package testngdemos;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import graphql.Assert;

public class newUsingassertion
{
  @Test
  public void f() 
  {
	  // hard assert
//      -------------
//	  Assert.assertTrue(true);
//	  System.out.println("hii lets testing started ");
//	  Assert.assertTrue(true);
//	  System.out.println("Testing started");
////	  Assert.assertTrue(false);
////	  System.out.println("testing is failed ");
//	  Assert.assertFalse(false);
//	  System.out.println("new ");
	  
	  
	  // Softassert
//       -----------	  
	  SoftAssert sa=new SoftAssert();
	  sa.assertTrue(true);
	  System.out.println("hii everthing fine");
	  sa.assertTrue(false);
	  System.out.println("everything not fine");
	  sa.assertFalse(false);
	  System.out.println("new everything fine");
	  sa.assertFalse(true);
	  System.out.println("new everything not fine"); 
	  
	  // to know the real result
	   sa.assertAll();
	  
  }
}
