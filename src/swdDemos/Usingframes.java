package swdDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Usingframes 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\adity\\BrowserDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://qhmit.com/html/html_editors/scratchpad/?example=/javascript/examples/javascript_alert_box_onclick");
		
		driver.switchTo().frame("preview");
		
		driver.findElement(By.xpath("/html/body/input")).click();
		
		 String msg=driver.switchTo().alert().getText();
		 System.out.println(msg);
		 driver.switchTo().alert().accept();
		

	}

}
