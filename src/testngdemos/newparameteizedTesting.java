package testngdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class newparameteizedTesting
{
  @Test
  @Parameters({"ddvalue1","txtvalue1"})   // this is connected to the .XML file to bring parameter.
  public void search1(String ddvalue1,String txtvalue1)  // this will take the parameter value from the parameter annotation
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\adity\\BrowserDriver\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://ebay.com");
	  
	  WebElement dd= driver.findElement(By.xpath("//*[@id=\'gh-cat\']"));
	  
	  Select s=new Select(dd);
	  s.selectByVisibleText(ddvalue1);
	  
	  driver.findElement(By.xpath("//*[@id=\'gh-ac\']")).sendKeys(txtvalue1);
	  driver.findElement(By.xpath("//*[@id=\'gh-btn\']")).click();
	  
	  Reporter.log("'" + txtvalue1 + "' product search in " + ddvalue1 + "' category test is sucess '");
	 // this has to run in testNg suite. 
  }
}
