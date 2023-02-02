package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDownKeysUp {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");

		//created object of ChromeDriver
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		//launch url
		driver.get("https://www.facebook.com/");
     Thread.sleep(1000);
     WebElement signInButton = driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]"));
    // signInButton.click();//by using webElement method
    // using Actions class
   //  1. create an object of Actions class and pass WebDriver object as parameter 
     Actions act= new Actions(driver);
     act.click(signInButton).perform();
     Thread.sleep(1000);
     WebElement firstname = driver.findElement(By.name(""));
   //  act.sendKeys(firstname,"Ujwala").perform();
     act.keyDown(firstname,Keys.SHIFT).sendKeys("U").keyUp(Keys.SHIFT).sendKeys("jwala").build().perform();
	}

}
