package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");

		//created object of ChromeDriver
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		//launch url
		driver.get("http://www.uitestpractice.com/Students/Actions");
		Thread.sleep(1000);
		//1.
		Actions act=new Actions(driver);
       //2.
		WebElement source = driver.findElement(By.id("draggable"));
		
		WebElement dest = driver.findElement(By.id("droppable"));
		
		//3.
    // act.dragAndDrop(source, dest).perform();
     act.clickAndHold(source).moveToElement(dest).release().build().perform();
     
	}

}
