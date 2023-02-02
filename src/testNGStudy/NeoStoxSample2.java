package testNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NeoStoxSample2 {
  @Test
  public void NeoStoxLaunch() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");

		//created object of ChromeDriver
		WebDriver driver=new ChromeDriver();
		
		//driver.manage().window().maximize();
		//launch url
		driver.get("https://www.neostox.com/");
		Thread.sleep(1000);
		System.out.println("Hi this is printing statement");
		
		Reporter.log("Hi this is reporter");
		
		Reporter.log("Hi this is reporter-->console", true);
  
  }
  
  @Test
  public void upStoxLaunch() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");

		//created object of ChromeDriver
		WebDriver driver=new ChromeDriver();
		
		//driver.manage().window().maximize();
		//launch url
		driver.get("https://login.upstox.com/");
		Thread.sleep(1000);
		Thread.sleep(1000);
		System.out.println("Hi this is printing statement");
		
		Reporter.log("Hi this is reporter");
		
		Reporter.log("Hi this is reporter-->console", true);
  
  } 
}
