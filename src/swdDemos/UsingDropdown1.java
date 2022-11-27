package swdDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingDropdown1 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\adity\\BrowserDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://ebay.com");
		
		 WebElement dd=driver.findElement(By.xpath("//*[@id='gh-cat']"));
		
		Select sc=new Select(dd);
		sc.selectByVisibleText("Books");
		driver.findElement(By.xpath("//*[@id='gh-ac']")).sendKeys("selenium");
		driver.findElement(By.xpath("//*[@id='gh-btn']")).click();
		String tit=driver.getTitle();
		System.out.println(tit);
		
		
	}

}
