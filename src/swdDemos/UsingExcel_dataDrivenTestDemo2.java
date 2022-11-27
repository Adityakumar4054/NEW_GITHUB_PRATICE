package swdDemos;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class UsingExcel_dataDrivenTestDemo2 
{

	public static void main(String[] args) throws IOException 
	{
		// here we are just calling the excell sheet
		XSSFWorkbook wb = new XSSFWorkbook(
				"C:\\Users\\adity\\ALL PROGRAMS\\mvnDemo9pm\\src\\test\\resources\\DDFWEbay2.xlsx");

		// in that excel sheet we are getting the perticular working sheet.
		XSSFSheet ws = wb.getSheet("Sheet1");

		// here er creating int type variable to store the number of rows.
		int rows = ws.getPhysicalNumberOfRows();

		// inthis method we used a "BrwserFactory" library class to open the Browser.
		WebDriver driver = BraswerFactory.openBrowser("Chrome", "http://ebay.com");

		// here we are storing the excel value by using the foe loop
		for (int i = 0; i < rows; i++) 
		{
			String ddvalue = ws.getRow(i).getCell(0).getStringCellValue();
			String txtvalue = ws.getRow(i).getCell(1).getStringCellValue();

			WebElement DD = driver.findElement(By.xpath("//*[@id='gh-cat']"));

			// we are select action class
			Select s = new Select(DD);
			s.selectByVisibleText(ddvalue);

			// we are writing a textvalue
			WebElement txt = driver.findElement(By.xpath("//*[@id='gh-ac']"));
			txt.clear();
			txt.sendKeys(txtvalue);

			driver.findElement(By.xpath("//*[@id='gh-btn']")).click();

		}
	}

}
