package swdDemos;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingCalander2
{

	public static void main(String[] args) throws Exception 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter amonth to choose : ");
		String month = sc.next();
		month = month.substring(0,3);
		System.out.print("enter the date : ");
		String dt = sc.next();

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\adity\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://redbus.in");

		driver.findElement(By.xpath("//*[@id='search']/div/div[3]/div/label")).click();

//		AThread.sleep(3000);
		System.out.println(month);
		String data = driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[2]"))
				.getText().substring(0,3);
		System.out.println(data);
		while (!data.equalsIgnoreCase(month))
		{
			System.out.println(data);
			driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[3]/button")).click();
		

			List<WebElement> rows = driver.findElements(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr"));
			for (int i = 3; i <= rows.size(); i++) 
			{
				List<WebElement> colom = driver
						.findElements(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[" + i + "]/td"));
				for (int j = 1; j <= colom.size(); j++) 
				{
					WebElement cell = driver.findElement(
							By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[" + i + "]/td[" + j + "]"));

					if (cell.getText().equals(dt))
					{
						cell.click();
						break;
					}
				}
			}
		}

		

	}

}
