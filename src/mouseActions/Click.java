package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click {

	private static WebElement signInButton;

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");

		//created object of ChromeDriver
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]"));
        //signInButton.click(); //by using webElement method
        // using action class
        //1.create an object of Action class and pass WebDriver object as parameter
        
        Actions act=new Actions(driver);
        //2. using one the Action class method take required Action.
        
		//act.click(signInButton).perform();
		
		act.moveToElement(signInButton).click().build().perform();
	}

}
