package swdDemos;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingCalander1
{

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the date : ");
		String dt=sc.next();
				
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\adity\\BrowserDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://redbus.in/");
		
		driver.findElement(By.xpath("//*[@id=\"onward_cal\"]")).click();
		
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr"));
		for(int i=3;i<=rows.size();i++)
		{
			List<WebElement> colom=driver.findElements(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr["+i+"]/td"));
			for(int j=1;j<=colom.size();j++)
			{
			  WebElement cell=driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr["+i+"]/td["+j+"]"));
			  
			  if (cell.getText().equals(dt))
			  {
				  cell.click();
				  break;
			  }
			}
		}

		
		
	}

}
