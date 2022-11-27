package testngdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTestdmeo 
{
  @Test
  @Parameters({"ddvalue","txtvalue"})    // create 2 parameters
  public void search(String ddvalue ,String txtvalue)
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\adity\\BrowserDriver\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://ebay.com");
	  
	  WebElement dd= driver.findElement(By.xpath("//*[@id=\'gh-cat\']"));
	  
	  Select s=new Select(dd);
	  s.selectByVisibleText(ddvalue);
	  
	  driver.findElement(By.xpath("//*[@id=\'gh-ac\']")).sendKeys(txtvalue);
	  driver.findElement(By.xpath("//*[@id=\'gh-btn\']")).click();
	  
	  Reporter.log("'" + txtvalue + "' product search in " + ddvalue + "' category test is sucess '");
	  
	  
	  
  }
}
