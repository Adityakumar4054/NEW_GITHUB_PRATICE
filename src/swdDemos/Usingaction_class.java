package swdDemos;

import java.awt.Desktop.Action;
import java.util.List;

import org.apache.commons.collections4.Get;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Usingaction_class 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\adity\\BrowserDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		
		driver.findElement(By.name("q")).sendKeys("amazon.in");
		
		Actions ac=new Actions(driver);
		ac.sendKeys(Keys.ENTER).perform();
		driver.findElement(By.xpath("//*[@id='tads']/div/div/div/div/div[1]/a/div[1]/span")).click();
		
		WebElement ddicn =driver.findElement(By.xpath("//*[@id='searchDropdownBox']"));
		
		
		ac.moveToElement(ddicn).perform();
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("selenium webdriver");
		driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();
		
		driver.get("https://jqueryui.com/selectable/");
		
		driver.switchTo().frame(0);
        WebElement element1 =driver.findElement(By.id("selectable"));
        List <WebElement> element = element1.findElements(By.tagName("li"));
        ac.keyDown(Keys.CONTROL).click(element.get(0)).click(element.get(3)).click(element.get(5)).perform();
		
		

	}

}
