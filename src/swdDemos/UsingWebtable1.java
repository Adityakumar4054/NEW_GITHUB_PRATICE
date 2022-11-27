package swdDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingWebtable1
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\adity\\BrowserDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		// to find out the all the row
		List<WebElement>rows=driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr"));
		
		// to iterrate the all row by using for loop
		for(int i=2;i<=rows.size();i++)
		{
			// to collect allthe column collection
			List<WebElement>colms=driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr["+ i +"]/td "));
			
			// to iterate between each coloumn of the row
			for(int j=1;j<=colms.size();j++)
			{
				WebElement cell=driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr["+ i +"]/td["+ j +"]"));
				// this will print the all data with using segreate of || sysmbole
				System.out.print(cell.getText()+ " || ");
			}
			// after one iteration this will mover to the second line.
			System.out.println();
		}
	}

}
