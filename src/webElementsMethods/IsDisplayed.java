package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");

		//created object of ChromeDriver
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
      // launch url
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//thread(1000);
		
		WebElement textBox = driver.findElement(By.name("show-hide"));
		textBox.sendKeys("Good evening");
		
		        
		WebElement hideButton = driver.findElement(By.id("hide-textbox"));
		hideButton.click();
		
		if(textBox.isDisplayed())
		{
			textBox.sendKeys("Hello");
		}
		else
		{
			driver.findElement(By.id("show-textbox")).click();
			textBox.sendKeys("Bye");
		}
	}

}
