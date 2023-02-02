package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MevetoElementStudy {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");

		//created object of ChromeDriver
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
       Thread.sleep(1000);
       //1. to take mouse actions, need to create object of actions class and pass webDriver object as parameter
       Actions act=new Actions(driver);
       //find Element to be act
       WebElement aboutUs= driver.findElement(By.xpath("//a[text()='About Us']"));
       
       //now take action ad perform
       act.moveToElement(aboutUs).perform();
       //aboutUs.click();  //using WebElement method
       //click method using action class
       act.click().perform();
       
       //i want click to click on radio button
         WebElement radio1= driver.findElement(By.xpath("//input[@value='Radio1']"));
        
		//act.moveToElement(radio1).perform();
         act.click().perform();
         act.moveToElement(radio1).click().build().perform();
         act.click(radio1).perform();
	}

}
