package swdDemos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Usingsync_implicitwaitDemo
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\adity\\BrowserDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://login.yahoo.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\'login-username\']")).sendKeys("venkatbj@yahoo.com");
		driver.findElement(By.xpath("//*[@id=\'login-signin\']")).click();
		driver.findElement(By.xpath ("//*[@id=\"login-passwd\"]")).sendKeys("123");
		

	}

}
