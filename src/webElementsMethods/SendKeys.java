package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");

		//created object of ChromeDriver
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		//launch url
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(1000);
		
		//sending keys in text field
		//we need to find element
		
		 driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Good Evening");
	      
	      //clear the existing or previous text
		 
		 Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='autocomplete']")).clear();
		 
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Good Morning");
		 
		 Thread.sleep(1000);
        //click is use to click on button
		 driver.findElement(By.xpath("//input[@class='radioButton'])[2]")).click();
				 
	}

}
