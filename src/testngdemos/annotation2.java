package testngdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class annotation2 extends newDatafactory
{
  @Test
  public void asearch() 
  {
	  
	  driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div[2]/span/span/g-popup/div[1]/div")).click();
	  driver.findElement(By.linkText("Advanced search")).click();
  }
}
