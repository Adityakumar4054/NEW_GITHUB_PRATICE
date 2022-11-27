package swdDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BraswerFactory 
{
	// we created a webdriver type varible to use in different class.
	public static WebDriver wd;
    // we are creating a nested if case to choose the browser.
	public static WebDriver openBrowser(String browser, String url)
	{
		if (browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\adity\\BrowserDriver\\chromedriver.exe");
			wd = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.firefox.driver", "C:\\Users\\adity\\BrowserDriver\\geckodriver.exe");
			wd = new FirefoxDriver();
		}

		wd.manage().window().maximize();
		wd.get(url);
		return wd;

	}

}
