package testNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NeostoxSampleClass {
  @Test
  public void sample() 
  {
	  System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");

		//created object of ChromeDriver
		WebDriver driver=new ChromeDriver();
		
		//driver.manage().window().maximize();
		//launch url
		driver.get("https://www.neostox.com/");
  }
}
