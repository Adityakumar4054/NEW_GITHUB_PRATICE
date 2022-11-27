package testngdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class dependencytestdemo extends Driverfactory
{
	
  @Test 
  public void Search()
  {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\adity\\BrowserDriver\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("http://ebay.com");
	 
  }
   @Test
   public void checktitle()
    {
	   String title=driver.getTitle();
	   Assert.assertEquals(title, "Google");
	 
    }
}
