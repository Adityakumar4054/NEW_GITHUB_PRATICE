package testngdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class newAmazonTest extends newDatafactory
{
  @Test
  public void NeAsearch() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\adity\\BrowserDriver\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://amazon.com");
	  
	  driver.findElement(By.xpath("//*[@id=\'twotabsearchtextbox\']")).sendKeys("LG");
	  driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
	  
	  Reporter.log("amazon test is sucessfull",true);
  }
}
 