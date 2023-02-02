package desiredCapabilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DesiredCapabilitiesStudy {

	private static String myText;

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");

		//created object of chrome options
		ChromeOptions opt=new ChromeOptions();
		//call method addArgumentss and add desired options
		//opt.addArguments("--disable-notifications");
		opt.addArguments("disable-infobars");
		
		WebDriver driver=new ChromeDriver(opt);
		//driver.manage().window().maximize();
		driver.get("https://www.justdial.com/");
		Thread.sleep(5000);
		
        driver.findElement(By.xpath("//span[text()='Popular Services ']")).getText();
        System.out.println("text is "+myText);
	}

	
}
