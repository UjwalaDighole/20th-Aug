package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");

		//created object of ChromeDriver
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
        Thread.sleep(1000);
        //1. create object of action class
        Actions act=new Actions(driver);
        
        //2. find element
       WebElement day = driver.findElement(By.id("day"));
       
       //3. Take required action
       act.click(day).perform();
       Thread.sleep(1000);
       act.sendKeys(Keys.ARROW_UP).perform();
       Thread.sleep(1000);
       act.sendKeys(Keys.ARROW_UP).perform();
       Thread.sleep(1000);
       act.sendKeys(Keys.ARROW_UP).perform();
       Thread.sleep(1000);
       act.sendKeys(Keys.ENTER).perform();
	}

}
