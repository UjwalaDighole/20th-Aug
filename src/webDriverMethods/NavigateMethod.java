package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args)throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://paytm.com/");
       Thread.sleep(1000);
        
       driver.navigate().to("https://www.facebook.com/");
       Thread.sleep(1000);
        
        driver.navigate().back();
       Thread.sleep(1000);
        
      driver.navigate().forward();
       Thread.sleep(1000);
        
       driver.navigate().refresh();
	}

}