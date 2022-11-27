package swdDemos;

import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingExcel_dataDrivenTestDemo 
{

	public static void main(String[] args) throws Exception 
	{
		XSSFWorkbook wb=new XSSFWorkbook("C:\\Users\\adity\\ALL PROGRAMS\\TestData\\EbayTestData.xlsx");
		XSSFSheet  ws=wb.getSheet("Sheet1");
		int nrows=ws.getPhysicalNumberOfRows();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\adity\\BrowserDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://ebay.com");
		
		for(int i=1;i<=nrows; i++)
		{
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			String ddvalue=ws.getRow(i).getCell(0).getStringCellValue();
			String txtvalue=ws.getRow(i).getCell(1).getStringCellValue();
			
			new Select(driver.findElement(By.xpath("//*[@id=\'gh-cat\']"))).selectByVisibleText(ddvalue);
			
			WebElement txt=driver.findElement(By.xpath("//*[@id=\'gh-ac\']"));
			txt.clear();
			txt.sendKeys(txtvalue);
			
			driver.findElement(By.xpath("//*[@id=\'gh-btn\']")).click();
			
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			
			
			
			
		}
		
		
     
	}

}
