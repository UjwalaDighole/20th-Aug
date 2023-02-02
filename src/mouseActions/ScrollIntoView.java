package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollIntoView {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");

		//created object of ChromeDriver
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		//launch url
		driver.get("https://vctcpune.com/");
     Thread.sleep(1000);
     //1.
     Actions act=new Actions(driver);
     //2.
     WebElement katraj = driver.findElement(By.xpath("//strong[text()='Katraj Branch']"));
     //3.
     act.scrollToElement(katraj).perform();
	}

}

