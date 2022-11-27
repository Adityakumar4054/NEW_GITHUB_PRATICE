package JavaScirpt_Demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuterDemo 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\adity\\BrowserDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.twoplug.com");
		WebElement elm=driver.findElement(By.xpath("//*[@id=\'hdv3Billboard197BuyID\']"));
		JavascriptUtlis.flash(elm, driver);
	}

}
