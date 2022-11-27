package testngdemos;

import org.testng.annotations.Test;

public class new_MultiTest_PrioritizeTest
{
  @Test (priority = 1)
  public void Login()
  {
	System.out.println("login test script");  
  }
  @Test(priority = 4)
  public void Logout()
  {
	System.out.println("Logout in test script");  
  }
  @Test(priority = 2)
  public void Deposite()
  {
	System.out.println("deposite in test script");  
  }
  @Test(priority = 3)
  public void Withdraw()
  {
	System.out.println("withdraw in test script");  
  }
}
