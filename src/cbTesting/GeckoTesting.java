package cbTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GeckoTesting {
  @Test
  public void fireFoxTesting() throws InterruptedException 
  {
	  System.setProperty("webdriver.gecko.driver", "F:\\geckodriver-v0.32.0-win64\\geckodriver.exe");

			//created object of ChromeDriver
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			//url
			driver.get("https://vctcpune.com/selenium/practice.html");
	        Thread.sleep(3000);
  }
}
