package testngdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ebayTest
{
  @Test
  public void esrarch()
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\adity\\BrowserDriver\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://ebay.com");
	  
	     WebElement dd=driver.findElement(By.xpath("//*[@id=\'gh-cat\']"));
	     Select sl= new Select(dd);
	     sl.selectByVisibleText("Books");
	     
	     driver.findElement(By.xpath("//*[@id=\'gh-ac\']")).sendKeys("joke");
	     driver.findElement(By.xpath("//*[@id=\'gh-btn\']")).click();
	     
	     Reporter.log("Ebay search test is success........",true);
	  
  }
}
