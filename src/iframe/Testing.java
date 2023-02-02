package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");

		//created object of ChromeDriver
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		driver.switchTo().frame("iframe-name");
          WebElement text = driver.findElement(By.xpath("//h3[contains(text(),'For Velocity class')]"));
        System.out.println("iframe text is "+text);
        Thread.sleep(1000);
        
       driver.switchTo().defaultContent();
      String mainpagetext = driver.findElement(By.xpath("//legend[text()='iFrame Example']")).getText();
     System.out.println("Main page text is "+mainpagetext);
	}
	

}
