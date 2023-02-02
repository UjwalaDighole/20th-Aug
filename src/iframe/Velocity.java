package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Velocity {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");

		//created object of ChromeDriver
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
         Thread.sleep(1000);
         driver.switchTo().frame("iframe-name");
         
         String text = driver.findElement(By.xpath("//h3[contains(text(),'For Velocity class')]")).getText();
         System.out.println("iframe text is "+text);
         
         Thread.sleep(1000);
         
         //switch focus from iframe to main page
         driver.switchTo().defaultContent();
         String mainpagetext= driver.findElement(By.xpath("//legend[text()='iFrame Example']")).getText();
         System.out.println("main page text is "+mainpagetext);
	}

}
