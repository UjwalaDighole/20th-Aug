package scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingIntoView {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");

		//created object of ChromeDriver
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://en.wikipedia.org/wiki/India");
		Thread.sleep(1000);
       //decide where to scroll and store in ref variable
		WebElement ancient_India = driver.findElement(By.id("Ancient_India"));
		//type cast driver object into JavaScriptExecutor
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//call method execute Script
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView(true)",ancient_India);
		
	}

}
