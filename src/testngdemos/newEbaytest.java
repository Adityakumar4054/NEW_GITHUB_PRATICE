package testngdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class newEbaytest extends newDatafactory
{
  @Test
  public void NeSearch () 
  {
	
	  
	 // storing dropdown path in webelement object that is " dd".
	 // ---------------------------------------------------------
	  WebElement dd=driver.findElement(By.xpath("//*[@id=\'gh-cat\']"));
	  
	  // creating a Select class.
	  //-------------------------
	  Select s=new Select(dd);
	  s.selectByVisibleText("Cameras & Photo");
	  
	  
	  driver.findElement(By.xpath("//*[@id=\'gh-ac\']")).sendKeys("sony");
	  driver.findElement(By.xpath("//*[@id=\'gh-btn\']")).click();
	  
	  // if we want to display our message in report then we have to use "Reporter. Log(" message");
	  // if we want to display our message in report and console window then we have to use "Reporter. Log("message",true);
//                                                                                                            -----
	  Reporter.log("Ebay search is sucessfull ",true);
	  
  }   
  
}
