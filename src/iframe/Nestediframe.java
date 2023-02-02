package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Nestediframe {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");

		//created object of ChromeDriver
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	   driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
       Thread.sleep(1000);
       driver.switchTo().frame("frame1");
       
       driver.findElement(By.tagName("input")).sendKeys("selenium");
       //switching focus from frame1 to inner frame
       driver.switchTo().frame("frame3");
       Thread.sleep(300);
       
       //checking the check box
       driver.findElement(By.id("a")).click();
       
       //switch focus from child frame to main page
       driver.switchTo().defaultContent();
       String mainpagetext = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText();
       System.out.println("text on main page is "+mainpagetext);
       
       //switch focus main page to frame2
       driver.switchTo().frame("frame2");
       WebElement animals = driver.findElement(By.id("animals"));
       Select s=new Select(animals);
       Thread.sleep(1000);
       s.selectByValue("big baby cat");
       Thread.sleep(1000);
       s.selectByVisibleText("Avatar");
       Thread.sleep(1000);
       s.selectByIndex(2);
       
       driver.switchTo().defaultContent();
       String mainpagetext2 = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText();
       System.out.println("mainpagetext is "+mainpagetext2);
       
       
	}

}
