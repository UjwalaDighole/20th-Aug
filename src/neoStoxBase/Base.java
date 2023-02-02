package neoStoxBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import neoStoxUtility.Utility;

public class Base 
{
      protected static WebDriver driver;
      public void launchBrowser()
      
      {
    	  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");

  		//created object of ChromeDriver
  		 driver=new ChromeDriver();
  		
  		driver.manage().window().maximize();
  		driver.get("https://neostox.com/");
  
  		Utility.implicitWait(1000,driver);
  		Reporter.log("launching browser",true);
      }
}
