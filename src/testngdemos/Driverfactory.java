package testngdemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Driverfactory
{
	
	// use like a libarary function.
	 public  WebDriver driver; //this line "WebDriver driver" was written out of the method  because of this can be used any univercially means ,we can use that 
//                             in  different method in that class or different method of another class.	
	                            
  @BeforeTest
  public void beforeTest() throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\adity\\BrowserDriver\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://google.com");
	
  }

  @AfterTest
  public void afterTest() 
  {
	  driver.close();
  }

}
