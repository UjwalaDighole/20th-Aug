package webTable;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Neostox {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");

		//created object of ChromeDriver
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		//launch url
        driver.get("https://neostox.com/sign-in");
        Thread.sleep(1000);
        driver.findElement(By.id("MainContent_signinsignup_txt_mobilenumber")).sendKeys("8805875528");
        Thread.sleep(1000);
        driver.findElement(By.id("lnk_signup1")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("txt_accesspin")).sendKeys("3007");
        Thread.sleep(1000);
        driver.findElement(By.id("lnk_submitaccesspin")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//a[@class='btn btn-sm neobutton'])[7]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//a[@class='neobutton'])[25]")).click();
        
        driver.findElement(By.id("lnk_pendingorders")).click();
        Thread.sleep(2000);
      List<WebElement> table = driver.findElements(By.xpath("(//table[@class='table-hover table-bordered trade-summary-table'])[2]"));
      Thread.sleep(2000);
        Iterator<WebElement> it = table.iterator();
        
        while(it.hasNext());
        {
        	System.out.println(it.next().getText());
        }
        Thread.sleep(2000);
        for(WebElement f:table)
        {
        	System.out.println(f.getText());
        }
        		
	}

}
