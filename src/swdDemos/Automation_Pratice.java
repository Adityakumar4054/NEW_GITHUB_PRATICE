package swdDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Automation_Pratice
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\adity\\BrowserDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
	
		String st =driver.findElement(By.xpath("//*[@id='header-inner']/div[1]/h1")).getText();
		
		if (st.equalsIgnoreCase("Automation Testing Practice"))
		{
			// New windows
			//-----------------
			driver.findElement(By.xpath("//*[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("ebay.com");
//			driver.findElement(By.xpath("//*[@id='Wikipedia1_wikipedia-search-form']/div/span[2]/span[2]/input")).click();
//			Thread.sleep(3000);
//			driver.findElement(By.xpath("//*[@id='wikipedia-search-result-link']/a")).click();
//			Thread.sleep(3000);
//			driver.navigate().back();
			
			//Alert
			//------
			driver.findElement(By.xpath("//*[@id='HTML9']/div[1]/button")).click();
			String Alt_msg=driver.switchTo().alert().getText();
			System.out.println(Alt_msg);
			Thread.sleep(3000);
			driver.switchTo().alert().accept();
			
			//DropDown speed
			//-------------
			 WebElement DD_speed=driver.findElement(By.xpath("//*[@id='speed']"));
			 Select s1=new Select(DD_speed);
			 s1.selectByVisibleText("Fast");
			 
			//DropDown file
			//------------
			 WebElement DD_file=driver.findElement(By.xpath("//*[@id='files']"));	 
			 Select s2=new Select(DD_file);
			 s2.selectByVisibleText("PDF file");
			 
			//DropDown number
			//------------
			 WebElement DD_number=driver.findElement(By.xpath("//*[@id='number']"));	 
			 Select s3=new Select(DD_number);
			 s3.selectByVisibleText("3");
				 
			//DropDown porduct
			//------------
			WebElement DD_porduct=driver.findElement(By.xpath("//*[@id='products']"));	 
		    Select s4=new Select(DD_porduct);
		    s4.selectByVisibleText("Iphone");	 
		    
		  //DropDown animal
			//------------
			WebElement DD_animal=driver.findElement(By.xpath("//*[@id='animals']"));	 
		    Select s5=new Select(DD_animal);
		    s5.selectByVisibleText("Avatar");	
		    
		 // date picker
		 //-----------		
		    driver.findElement(By.xpath("//*[@id='datepicker']")).click();
		   List<WebElement> rows=driver.findElements(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr"));
		    
			 
//			for(int i=3;i<=rows.size();i++) 
//			{
//				List<WebElement> column=driver.findElements(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr["+ i +"]/td"));
//				for(int j=1;j<=column.size();j++)
//				{
//					// fetch the cell 
//					WebElement cell=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr["+ i +"]/td["+ j +"]/a"));
//				
//			
//			        if(cell.getText().equals("20"))
//			        {
//			        	cell.click();
//			        }
//			
//				
//			
//				}
//			}
			//slider function
			//-------------
			 WebElement slider=driver.findElement(By.xpath("//*[@id='slider']/span"));//  to store the slider location value.
			System.out.println(slider.getLocation()); //(979, 1375)
			System.out.println(slider.getSize());
			Actions a=new Actions(driver);
			a.dragAndDropBy(slider, 300, 0).perform();
				
			 
			 
			
			
			
			
		}
		else
		{
			System.out.println("Please enter the corrcect url");
		}
		
		

	}

}
