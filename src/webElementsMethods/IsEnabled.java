package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled 
    {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");

		//created object of ChromeDriver
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//launch url
		driver.get("https://auth.discoveryplus.in/login?flow=OTPLogin");
        Thread.sleep(1000);
        
         WebElement getOTPButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
         boolean results=getOTPButton.isEnabled();
         System.out.println("Current status is "+results);
         getOTPButton.click();
         
         driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("8888888888");
         
         if(getOTPButton.isEnabled())
         {
        	 boolean result=getOTPButton.isEnabled();
        	 System.out.println("Current status is "+result);
        	 getOTPButton.click();
         }
         else
         {
        	 System.out.println("OTP button is not enabled");
         }
	}

}
