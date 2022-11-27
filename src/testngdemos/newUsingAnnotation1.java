package testngdemos;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class newUsingAnnotation1 
{
  @Test
  public void Asearch()
  {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\adity\\BrowserDriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://google.com");
	driver.findElement(By.name("q")).sendKeys("selenium");
	Actions a=new Actions(driver);
	a.sendKeys(Keys.ENTER).perform();
	
  }
}
