package neoStoxPOMClassesUsingDDF1;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import neoStoxPOMClassesUsingDDF.NeoStoxDashBoardPage;
import neoStoxPOMClassesUsingDDF.NeoStoxHomePage;
import neoStoxPOMClassesUsingDDF.NeoStoxPasswordPage;
import neoStoxPOMClassesUsingDDF.NeoStoxSignInPage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;


public class ValidateUserNeoStoxNameUsingGeneralMethods 
{
	 WebDriver driver;
	 NeoStoxHomePage home;
	 NeoStoxSignInPage signIn;
	 NeoStoxPasswordPage pwd;
	 NeoStoxDashBoardPage dash;
	  String s="TCID-1234";
	
  @BeforeClass
  public void launchBrowser()
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");

		//created object of ChromeDriver
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://neostox.com/");
		GeneralMethods.implicitWait(1000, driver);
		Reporter.log("Launching launch NeostoxApp",true);
		home= new NeoStoxHomePage(driver);
		signIn= new NeoStoxSignInPage(driver);
		pwd= new NeoStoxPasswordPage(driver);
		dash= new NeoStoxDashBoardPage(driver);
  }
   @BeforeMethod
   public void loginToNeoStoxApp() throws EncryptedDocumentException, IOException, InterruptedException
   {
	   home.clickOnSignInButton();
	   GeneralMethods.implicitWait(1000, driver);
	   
	   signIn.enterMobileNumber(GeneralMethods.readDataFromExcel(0, 0));
	   signIn.clickOnSignInButton();
	   
	   GeneralMethods.implicitWait(1000, driver);
	   
	   pwd.enterPassword(GeneralMethods.readDataFromExcel(0, 1));
	   Thread.sleep(1000);
	   pwd.clickOnSubmitButton();
	   
	   GeneralMethods.implicitWait(5000, driver);
        dash.handlePopUp();
        GeneralMethods.implicitWait(1000, driver); 
   }
   @Test
   public void validateUserName() throws EncryptedDocumentException, IOException
   {
	   Assert.assertEquals(dash.getActualUserName(),GeneralMethods.readDataFromExcel(0, 2),"Actual and Expected UserNames are not matching TC is failed" );
	  
	   GeneralMethods.takeScreenshot(driver, s);
   }
    
   @AfterMethod
   public void logOutFromNeoStox() throws InterruptedException
   {
	   GeneralMethods.implicitWait(1000, driver);
       dash.logOutFromNeoStox();
   }
   
   @AfterClass
   public void closeBrowser()
   {
	   driver.close();
   }
   
}
