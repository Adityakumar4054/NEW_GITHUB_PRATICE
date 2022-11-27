package JavaScirpt_Demos;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavascriptUtlis
{
	public static void flash(WebElement elmt ,WebDriver driver) 
	{
	 String bgcolor= elmt.getCssValue("backgroundColor");// storing thde present the color
	 for(int i=0; i<500; i++)
	 {
		 changecolor("#000000",elmt,driver);// black color "#000000"
		 changecolor(bgcolor,elmt,driver);// presen color
		 
	 }
	  
	}
	public static void  changecolor(String color,WebElement elmt ,WebDriver driver)
	{
		// here we are using java script exicuter
		JavascriptExecutor js=((JavascriptExecutor) driver);// this two line we have to remember.
		js.executeScript("arguments [0].style.backgroundColor='"+color+"'",elmt);
		

	}

}
