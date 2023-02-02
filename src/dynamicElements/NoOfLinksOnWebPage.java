package dynamicElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfLinksOnWebPage {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");

		//created object of ChromeDriver
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		//launch url
		driver.get("https://www.google.co.in/");
      Thread.sleep(1000);
     //how may links on webpage
      List<WebElement> links = driver.findElements(By.tagName("a"));
      System.out.println("no of links are"+links.size());
      
      //what are those links?
      
      for(WebElement l:links)
      {
    	  System.out.println(l.getText());
      }
	}

}
