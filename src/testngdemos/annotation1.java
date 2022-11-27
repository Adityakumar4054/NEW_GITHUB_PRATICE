package testngdemos;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class annotation1 extends newDatafactory
{
  @Test
  public void search () 
  {
	 
	  
	  driver.findElement(By.name("q")).sendKeys("selenium webdrivre");
	  
	  Actions a=new Actions(driver);
	  a.sendKeys(Keys.ENTER).perform();
	  
  }
}
