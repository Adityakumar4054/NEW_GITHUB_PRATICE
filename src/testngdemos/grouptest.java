package testngdemos;

import org.testng.annotations.Test;

public class grouptest
{
	 @Test(groups = {"login"})
	  public void login() 
	  {
		  System.out.println("LOgin in test");
	  }
	  @Test(groups = {"trans"})
	  public void deposte()
	  {
		  System.out.println("Deposite test");
	  }
	  @Test (groups = {"trans"})
	  public void withdraw()
	  {
		  System.out.println("with draw test");
	  }
	  @Test(groups = {"login"})
	  public void logout()
	  {
		  System.out.println("logout test");
	  }
}
