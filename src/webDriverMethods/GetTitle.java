package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/");
	
        Thread.sleep(1000);
        
        String title = driver.getTitle();
        System.out.println("Title of web page is "+title);
        
        String url=driver.getCurrentUrl();
        System.out.println("The current url is "+url);
	}

}
