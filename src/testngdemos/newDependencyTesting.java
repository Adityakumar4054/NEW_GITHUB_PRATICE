package testngdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class newDependencyTesting extends newDatafactory
{
  @Test(dependsOnMethods = "chktitle") // here we are making  dependency from chktitle method to Search method.
  public void Search()
  {
 driver.findElement(By.name("q")).sendKeys("selenium webdrivre");
	  
	  Actions a=new Actions(driver);
	  a.sendKeys(Keys.ENTER).perform();
  }
  @Test
  public void chktitle()
  {
	  String tit=driver.getTitle();
//    insted of using if else or some other ststement we are using "Assert" for to comapre whether the title is matching or not.
	  Assert.assertEquals(tit, "Google");
  }
  
}
