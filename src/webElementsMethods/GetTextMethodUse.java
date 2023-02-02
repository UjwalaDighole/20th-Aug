package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethodUse {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");

		//created object of ChromeDriver
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//launch url
		driver.get("https://paytm.com/");
		Thread.sleep(1000);
		
         String actualText=driver.findElement(By.xpath(" //h1[contains(text(),'Recharge & Pay Bills')]")).getText();
         
         String expectedText="Recharge & Pay Bills on Paytm.";
         System.out.println("Actual text is"+actualText);
         
         if(actualText.equals(expectedText))
         {
        	 System.out.println("Text is matching TC is passed");
         }
         
         else
         {
        	 System.out.println("Text is not matching TC is failed");
         }
         
	}

}
