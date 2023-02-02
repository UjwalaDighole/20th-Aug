package neoStoxPOMClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NeoStoxTestClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");

		//created object of ChromeDriver
	
		 WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//launch url
		driver.get("https://neostox.com/");
		
		//create an object of home page
		NeoStoxHomePage home=new NeoStoxHomePage(driver);
		home.clickOnSignInButton();
		
		//signIn Page
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		NeoStoxSignInPage signIn = new NeoStoxSignInPage(driver);

		signIn.enterMobileNumber(null);
		signIn.clickOnSignInButton();
		
		//password page
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		NeoStoxPasswordPage password= new NeoStoxPasswordPage(driver);
		
		password.enterPassword(null);
		password.clickOnSubmitButton();
		
		//dashBoard Page
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		NeoStoxDashBoardPage dashBoard= new NeoStoxDashBoardPage(driver);
		
		dashBoard.handlePopUp(driver);
		dashBoard.validateUserName();
		
		dashBoard.logOutFromNeoStox();
		driver.close();
		
   }
}
