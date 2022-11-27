package swdDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingAuthanticationsPopup 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\adity\\BrowserDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//here we are using a comand to for open a "authanticationpoup" handle
		//--------------------------------------------------------------------
		//syntex= http://USERNAME:PASSWORD@test.com;
		driver.get("http://username:password@the.internet.herokuapp.com/basic_auth");// the site is not working.....................

	}

}
