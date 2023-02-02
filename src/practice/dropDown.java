package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");

		//created object of ChromeDriver
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
       driver.get("https://www.facebook.com/");
       Thread.sleep(1000);
       
       driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]")).click();
       Thread.sleep(1000);
      WebElement day = driver.findElement(By.id("day"));
      Select s=new Select(day);
      s.selectByVisibleText("1");

    WebElement month = driver.findElement(By.id("month"));
      Select s1=new Select(month);
      s1.selectByIndex(8);
      
     WebElement year = driver.findElement(By.id("year"));
     Select s2=new Select(year);
     s2.selectByValue("2020");
	}

}
