package dynamicElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnorderedList {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");

		//created object of ChromeDriver
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		//launch url
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
       driver.findElement(By.name("q")).sendKeys("honda");
      Thread.sleep(500);
      List<WebElement> searchResults = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
       System.out.println("No of items in list are"+searchResults.size());
       for(WebElement s:searchResults)
       {
    	   System.out.println(s.getText());
       }
      
       for(WebElement result:searchResults) //1---10
         {
    	   String expected="Honda amaze";
    	   String actual=result.getText(); //1
    	   if(expected.equals(actual))
    	   {
    		   System.out.println("Clicked on"+result.getText());
    		   result.click();
    		   break;
    	   }
       }
       Thread.sleep(500);
      driver.findElement(By.linkText("Images")).click();
	}

}
