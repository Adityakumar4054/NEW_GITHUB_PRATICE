package testngdemos;

import org.testng.annotations.Test;

public class multi_and_prioritized_test 
{
  @Test(priority = 1)
  public void login() 
  {
	  System.out.println("LOgin in test");
  }
  @Test(priority = 2)
  public void deposte()
  {
	  System.out.println("Deposite test");
  }
  @Test (priority = 3)
  public void withdraw()
  {
	  System.out.println("with draw test");
  }
  @Test(priority = 4)
  public void logout()
  {
	  System.out.println("logout test");
  }
}
