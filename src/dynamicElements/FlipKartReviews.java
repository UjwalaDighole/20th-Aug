package dynamicElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKartReviews {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");

		//created object of ChromeDriver
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		//launch url
		driver.get("https://www.flipkart.com/");
      Thread.sleep(1000);
      //handle hidden div popup-->
      //clicking close button of hidden div pop up
      driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
      Thread.sleep(1000);
      //sending data in search bar
      driver.findElement(By.name("q")).sendKeys("i phone 14");
      //clicking on search button
      driver.findElement(By.xpath("//button[@type='submit']")).click();
      Thread.sleep(1000);
     String reviews = driver.findElement(By.xpath("((//div[@class='col col-7-12'])[1]//span)[6]")).getText();
     		
      System.out.println("Reviews are"+reviews);
	}

}
