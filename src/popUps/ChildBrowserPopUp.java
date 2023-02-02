package popUps;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");

		//created object of ChromeDriver
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		//launch url
		driver.get("https://skpatro.github.io/demo/links");
		Thread.sleep(1000);
      driver.findElement(By.name("NewWindow")).click();
      String mainpageID = driver.getWindowHandle();
      System.out.println("main page id "+mainpageID);
      
    //to get multiple(all page IDs use method getWindowHandles--> will return set of String)
      
    Set<String> idOfAllPages = driver.getWindowHandles();
     Iterator<String> it = idOfAllPages.iterator();
     
     String mainPageIDnew = it.next();//ID of Main Page
     System.out.println(mainPageIDnew);
     String childPageID = it.next();//ID of child Page
     //need to Switch Selenium focus from main page to childPage
     
     driver.switchTo().window(childPageID); //focus switched to child page
     driver.manage().window().maximize();
     //writing text in child Text box
     Thread.sleep(1000);
     driver.findElement(By.id("the7-search")).sendKeys("Hello");
     driver.close();
    // driver.quit();
     //to work back to main page-->we need to switch selenium focus from child page to main page
     driver.switchTo().window(mainPageIDnew); //switching focus from child page to main page
     Thread.sleep(1000);
     
    String myText = driver.findElement(By.xpath("//b[text()='[Dummy Controls]']")).getText();
     System.out.println("text on main page is "+myText);
	}

}
