package scrolling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");

		//created object of ChromeDriver
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://en.wikipedia.org/wiki/India");
		Thread.sleep(1000);
		//type cast driver object into java scriptExecutor and store in ref variable
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		Thread.sleep(1000);
       
		//using object call method executeScript
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,900)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-700)");
	}

}
