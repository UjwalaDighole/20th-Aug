package DropDownStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowneg2 {

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
      WebElement dy = driver.findElement(By.id("day"));
       Select s=new Select(dy);
       
       s.selectByVisibleText("3");
       Thread.sleep(1000);
       
       //handling month
        WebElement month = driver.findElement(By.id("month"));
        Select s1=new Select(month);
        s1.selectByIndex(7);
        
        //handling year
       WebElement year = driver.findElement(By.id("year"));
        Select s2=new Select(year);
        s2.selectByValue("2020");
         System.out.println("year multiselection status is "+s2.isMultiple());        
	}

}
