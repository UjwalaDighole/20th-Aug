package selenium_Wait;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_wait_Study {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");

		//created object of ChromeDriver
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); syntax before selenium 4
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// latest syntax after selenium 4
		
		//you are waiting for 100sec page loaded in 20 sec once page loaded release timeout(80sec)

		

	}

}
