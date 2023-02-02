package webTable;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Neostox1 {

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
        
        driver.findElement(By.xpath("//a[@id='lnk_pendingorders']")).click();
	     Thread.sleep(1000);
	     List<WebElement> tableData = driver.findElements(By.xpath("(//table[@class='table-hover table-bordered trade-summary-table'])[2]"));
	     
	     Thread.sleep(2000);
	     System.err.println("======By using Iterator============");
	     
	     Iterator<WebElement> it = tableData.iterator();
	      while(it.hasNext()) {
		    System.out.println(it.next().getText());
	      }
	      Thread.sleep(2000);
	        System.err.println("=======By using for each loop============");  
	        
	      for(WebElement t:tableData) {
		 
		 System.out.println(t.getText());

	      }
	      
	      System.err.println("=======By using for loop============");

	      Thread.sleep(2000);
	      
	      for(int i=0;i<=2;i++)
	      {
	    	  for(int j=1;j<=12;j++)
	    	  {

	    		 
	    		  
	    		  String text = driver.findElement(By.xpath("(//table[@class='table-hover table-bordered trade-summary-table'])[1]//tr["+i+"]/td["+j+"]")).getText();
	    	 
	    		  System.out.print(text+"  ");
	    	  
	    	  }
	    	  System.out.println();
	      }
       	
	}


	}


