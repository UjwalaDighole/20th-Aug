package testKite;

import java.io.IOException;
import java.time.Duration;


import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import KitePOM.KiteHomePage;
import KitePOM.KiteLoginPage;
import KitePOM.KitePinPage;

public class KiteTest {

	public static void main(String[] args) throws EncryptedDocumentException,IOException
	{
		ChromeOptions options=new ChromeOptions();
		//options.addArguments("-disable-notification");
		options.addArguments("headless");
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");

		//created object of ChromeDriver
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
		KiteLoginPage login=new KiteLoginPage(driver);
		
		login.EnterUserID();
		login.EnterPassword();
		login.ClickOnLoginButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		KitePinPage Login2=new KitePinPage(driver);
		Login2.EnterPin();
		Login2.ClickOnContinue();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		KiteHomePage Home=new KiteHomePage(driver);
		Home.UserIdValidation();
		

	}

}
