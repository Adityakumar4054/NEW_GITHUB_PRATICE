package testngdemos;

import org.testng.annotations.Test;

public class newGroupTest 
{
	  @Test (groups = "login") // (groups = "login") this is login group
	  public void Login()
	  {
		System.out.println("login test script");  
	  }
	  @Test(groups = "login") // (groups = "login") this is login group
	  public void Logout()
	  {
		System.out.println("Logout test script");  
	  }
	  @Test(groups = "trans") // groups = "trans") this is trans group
	  public void Deposite()
	  {
		System.out.println("deposite in test script");  
	  }
	  @Test(groups = "trans" ) // groups = "trans") this is trans group
	  public void Withdraw()
	  {
		System.out.println("withdraw in test script");  
	  }
}
