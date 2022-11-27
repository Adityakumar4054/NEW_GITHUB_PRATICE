package testngdemos;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions
{
  @Test
  public void f() 
  {
	  //hard assertion
	  System.out.println("begining.....");
	  Assert.assertTrue(true);
	  System.out.println("1st test is passed"); //after "false" rest of the script will not execute. 
	  Assert.assertTrue(false);
	  System.out.println("3rd test is failed");
	  Assert.assertTrue(false);
	  System.out.println("4th test is failed");
	  Assert.assertTrue(true);
	  System.out.println("passsss.......");
  }
}
