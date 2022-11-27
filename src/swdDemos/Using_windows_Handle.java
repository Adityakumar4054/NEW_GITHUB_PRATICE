package swdDemos;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Using_windows_Handle
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\adity\\BrowserDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/");
		
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
//        driver.findElement(By.xpath("//*[@id=\'Open New Window\']")).click();
//        driver.findElement(By.xpath("//*[@id=\'post-2632\']/div[2]/div/div/div[2]/a")).click();
//        
//        // here we have to store the all windows id By using -Set class
//         Set<String> s=driver.getWindowHandles();
//         
//         // here we used to" for each" loop to display  all the string value
//         for(String i:s)
//         {
//        	System.out.println(i);
//        	String wn=driver.switchTo().window(i).getTitle();
//        	if(wn.contains("Frames and Window Dummy Testing Site - GlobalSQA"))
//        	{
//        		driver.close();
//        	}
//        	//System.out.println(wn);
//         }
		   WebElement sc=driver.findElement(By.xpath("//*[@id='post-2646']/div[2]/div/div/div/p/select"));
		   Select s=new Select(sc);
		   List <WebElement> lsc =s.getOptions();
		System.out.println(lsc.size());   
		
	}

}
