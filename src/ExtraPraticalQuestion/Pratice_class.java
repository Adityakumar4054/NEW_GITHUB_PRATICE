package ExtraPraticalQuestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pratice_class
{

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\adity\\BrowserDriver\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://demo.automationtesting.in//Register.html"); 
	     Thread.sleep(3000); 
	     
	     WebElement ml=driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[5]/div/label[1]/input"));
	     
	     System.out.println("display status:" +ml.isDisplayed()); // true
	     System.out.println(" enable status :" +ml.isEnabled());  // true
         
	     WebElement ml1=driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[5]/div/label[1]/input"));
	     WebElement feml2=driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[5]/div/label[2]/input"));
	  
	    // isSelected()
	     ml1.click();
	     
	    System.out.println("for male = "+ml1.isSelected()); // true 
	    System.out.println("for female = "+feml2.isSelected());// false

	}

}
