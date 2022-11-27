package swdDemos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpeninggamilandClosing 
{

	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\adity\\BrowserDriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://mail.google.com");
	
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	
//	driver.findElement(By.xpath("//*[@id=\'gb\']/div/div[1]/div/div[1]/a")).click();
	
	driver.findElement(By.cssSelector("#identifierId")).sendKeys("adityakumardas4054@gmail.com");
	
	
	driver.findElement(By.xpath("//*[@id=\'identifierNext\']/div/button/span")).click();
	
	
	
//	driver.findElement(By.xpath("//*[@id=\'password\']/div[1]/div/div[1]/input")).sendKeys("9338084245");
//	
//	driver.findElement(By.xpath("//*[@id=\'passwordNext\']/div/button/span")).click();
	}

}
