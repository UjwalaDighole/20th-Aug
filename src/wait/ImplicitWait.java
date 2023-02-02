package wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");

		//created object of ChromeDriver
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://en.wikipedia.org/wiki/India");
		Thread.sleep(1000);
       //implicit wait-->applicable for whole webPage
		
		driver.findElement(By.xpath(""));
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	}

}
