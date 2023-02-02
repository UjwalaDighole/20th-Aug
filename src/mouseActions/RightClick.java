package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");

		//created object of ChromeDriver
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
       Thread.sleep(1000);
      //1. created object an action class and pass WebDriver object as a argument
       Actions act= new Actions(driver);
       
       //2. find the element and store in ref variable 
      WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
       
	//3.by using one of the Actions class methods take required action
      // act.moveToElement(rightClickButton).contextClick().build().perform();
       act.contextClick(rightClickButton).perform();
	}

}
