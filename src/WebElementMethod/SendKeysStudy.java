package WebElementMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysStudy {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");

		//created object of ChromeDriver
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
      // launch url
        driver.get("https://www.facebook.com/");
      //  Thread.sleep(1000);
        
     //   driver.findElement(By.id("email")).sendKeys("123456");
	}

}
