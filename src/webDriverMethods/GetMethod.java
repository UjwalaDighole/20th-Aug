package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args)throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		//1get-to enter url in browser or to open an application
		 driver.get("https://paytm.com/");
		 
		 //2.close:to close the current tab of the browser opened by selenium tool.
		 
		 //driver.close();
		 
		 //3.quit:to close the all tabs present in browser opened by selenium tool.
		 //driver.quit();
		 
		 //4.maximize browser
		 
		 driver.manage().window().maximize();
		 
		 //5.minimize method
		 
		// driver.manage().window().minimize();
		 
		 
	}

}
