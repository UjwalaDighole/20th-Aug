package mouseActions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");

		//created object of ChromeDriver
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.uitestpractice.com/Students/Actions");
       Thread.sleep(1000);
       //1. create an object Action class and pass WebDriver object as a argument
       Actions act=new Actions(driver);
       
       //2. find the Element and stored in reference variable
       WebElement doubleClickButton = driver.findElement(By.name("dblClick"));
       Thread.sleep(1000);
       //3. using action class method take required action
     //  act.moveToElement(doubleClickButton).doubleClick().build().perform();
       
       act.doubleClick(doubleClickButton).perform();
       Thread.sleep(1000);
       //Handling Alert Popup
       //switch focus to Alert
       Alert alt= driver.switchTo().alert();
       Thread.sleep(1000);
       //use one the Alert method
       alt.accept(); //click on ok button
	}

}
