package testngdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class newUsingAnnotation2
{
  @Test
  public void f() 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\adity\\BrowserDriver\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://google.com");
	  
	  driver.findElement(By.xpath("//*[@id=\'ow19\']/div[1]/div")).click();
	  
  }
}
