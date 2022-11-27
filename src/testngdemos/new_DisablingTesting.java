package testngdemos;

import org.testng.annotations.Test;

public class new_DisablingTesting
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
	  @Test(priority = 2,enabled = false) //"enabled = false" it is for to enable the perticular method.
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
