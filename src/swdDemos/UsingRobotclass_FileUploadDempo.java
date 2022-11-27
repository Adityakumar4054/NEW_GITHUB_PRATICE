			package swdDemos;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UsingRobotclass_FileUploadDempo 
{

	public static void main(String[] args) throws Exception 
	{
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\adity\\BrowserDriver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://www.filemail.com/share/upload-file");
//
//		driver.findElement(By.xpath("//*[@id=\'addBtn\']")).click();
//
//		// Stringselection class object we have to create so that we can store the
//		// contenet path.
//		StringSelection path = new StringSelection("C:\\Users\\adity\\ALL PROGRAMS\\mvnDemo9pm\\src\\test\\resources\\aditya.bmp");
//
//		// we have to copy that content path in clipboard so we have to follow method.
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);
//		// to wait the systm for perticular time
//		Thread.sleep(2000);
//
//		// to perform windows based operaation we have to use "Robot class "
//		Robot r=new Robot();
//		
//		// to pest the path in text field in windows sytem.
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_V); 
//		
//		//this is used to release the keys 
//		r.keyRelease(KeyEvent.VK_V);
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		
//		// this is for to eneter the  button in windows system
//		r.keyPress(KeyEvent.VK_ENTER);
//		
//		//this is used to release the keys 
//		r.keyRelease(KeyEvent.VK_ENTER);
//	
		
		// This mehtod is used to download file in firefox browser by using Robot class 
		//--------------------------------------------------------------------------
		System.setProperty("webdriver.gecko.driver","C:\\Users\\adity\\BrowserDriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://spreadsheetpage.com/index.php/site/file/yearly_calender_workbook");

	}

}
