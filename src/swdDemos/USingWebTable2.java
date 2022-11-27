package swdDemos;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class USingWebTable2
{

	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		System.out.println(" pleasse enter the comnay to search ");
		String comny = sc.nextLine();
		String cntry = null;
		boolean isExist = false;

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\adity\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr"));

		for (int i = 2; i <= rows.size(); i++)
		{

			String webcat = driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr["+ i +"]/td[1]")).getText();
			if (webcat.equalsIgnoreCase(comny))
			{
				isExist = true;
				cntry = driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr["+ i +"]/td[3]")).getText();
				//System.out.println("'" + comny + "' company is available in the '" + cntry + "'");
				break;
			}
		}
		if (isExist==true)
		{
			System.out.println("'" + comny + "' company is available in the '" + cntry + "'");
		}
		else
		{
			System.out.println("'" + comny + "' company is not available in the webtable '" );
		}
		

	}
}
