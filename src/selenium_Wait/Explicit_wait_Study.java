package selenium_Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_wait_Study {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");

		//created object of ChromeDriver
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		
		WebElement Reviews = driver.findElement(By.xpath(("(//a[text()='Student Review'])[1]")));
      
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(30));
		// new Syntax
		//WebDriverWait wait= new WebDriverWait(driver, 30); old syntax
	
		w.until(ExpectedConditions.visibilityOf(Reviews));
	}

}
