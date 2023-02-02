package listBoxDropDown;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectionDropDown {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");

		//created object of ChromeDriver
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		//launch url
		driver.get("https://jsbin.com/?html,output");
		Thread.sleep(1000);
		
		WebElement fruits = driver.findElement(By.id("fruits"));
		Select s=new Select(fruits);
		System.out.println("MultiSelection Status is"+s.isMultiple());
        s.selectByVisibleText("Banana");
        Thread.sleep(100);
        s.selectByValue("orange");
        Thread.sleep(100);
        s.selectByIndex(1);
        Thread.sleep(1000);
      //  s.deselectAll();
     //   s.deselectByIndex(0);
     //   Thread.sleep(1000);
     //   s.deselectByValue("orange");
    //    Thread.sleep(1000);
    //    s.deselectByVisibleText("Apple");
        
        List<WebElement>allOptions = s.getAllSelectedOptions();
        Iterator<WebElement> it = allOptions.iterator();
        while(it.hasNext())
        {
        	System.out.println(it.next().getText());
        }
     System.out.println("========================================");
     
     for(int i=0; i<=allOptions.size()-1;i++)
     {
    	 System.out.println(allOptions.get(i).getText());
     }
     System.out.println("============================================");
     
     for(WebElement a:allOptions)
     {
    	 System.out.println(a.getText());
     }
     
     System.out.println("====================List iterator====================");
     ListIterator<WebElement> li= allOptions.listIterator();
     
     while(li.hasNext())
     {
     	System.out.println(li.next().getText());
     }
	}

}
