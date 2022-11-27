package swdDemos;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class UsingScreenshot
{

	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\adity\\BrowserDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		// here we are converting a webdrivertype object to screentype 
		File Fsource=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File Fdest = new File("C:\\Users\\adity\\ALL PROGRAMS\\ adityaPic.png");
	    FileHandler.copy(Fsource, Fdest);
		

	}

}
