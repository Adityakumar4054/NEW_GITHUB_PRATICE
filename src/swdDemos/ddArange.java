package swdDemos;



import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ddArange
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\adity\\BrowserDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");	
		WebElement list=driver.findElement(By.id("animals"));
		Select s=new Select(list);
		// we are using getoption method to store the all the dropdown method
		List orglst=new ArrayList() ;
		
		List <WebElement> li=s.getOptions();
		System.out.println(li);
		for(WebElement e:li)
		{
			orglst.add(e.getText());
		}
		System.out.println(orglst);
		
		Collections.sort(orglst);
		
		System.out.println(orglst);
				
		

	}

	
	}


