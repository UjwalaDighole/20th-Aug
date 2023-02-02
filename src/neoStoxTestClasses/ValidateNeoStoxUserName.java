package neoStoxTestClasses;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import neoStoxBase.Base;
import neoStoxPOMClassesUsingDDF.NeoStoxDashBoardPage;
import neoStoxPOMClassesUsingDDF.NeoStoxHomePage;
import neoStoxPOMClassesUsingDDF.NeoStoxPasswordPage;
import neoStoxPOMClassesUsingDDF.NeoStoxSignInPage;
import neoStoxUtility.Utility;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;


public class ValidateNeoStoxUserName extends Base
{
	 WebDriver driver;
	 NeoStoxHomePage home;
	 NeoStoxSignInPage signIn;
	 NeoStoxPasswordPage pwd;
	 NeoStoxDashBoardPage dash;
	  String s="TCID-1234";
	
  @BeforeClass
  public void launchNeoStoxApp()
  {
	    launchBrowser();
		home= new NeoStoxHomePage(driver);
		signIn= new NeoStoxSignInPage(driver);
		pwd= new NeoStoxPasswordPage(driver);
		dash= new NeoStoxDashBoardPage(driver);
  }
   @BeforeMethod
   public void loginToNeoStoxApp() throws EncryptedDocumentException, IOException, InterruptedException
   {
	   home.clickOnSignInButton();
	   Utility.implicitWait(1000, driver);
	   
	   signIn.enterMobileNumber(Utility.readDataFromExcel(0, 0));
	   Thread.sleep(1000);
	   signIn.clickOnSignInButton();
	   
	   Utility.implicitWait(1000, driver);
	   
	   pwd.enterPassword(Utility.readDataFromExcel(0, 1));
	   //Thread.sleep(1000);
	   pwd.clickOnSubmitButton();
	   
	   Utility.implicitWait(3000, driver);
        dash.handlePopUp();
        
   }
   @Test
   public void validateUserName() throws EncryptedDocumentException, IOException
   {
	   Assert.assertEquals(dash.getActualUserName(),Utility.readDataFromExcel(0, 2),"Actual and Expected UserNames are not matching TC is failed" );
	  
	   Utility.takeScreenshot(driver, s);
   }
    
   @AfterMethod
   public void logOutFromNeoStox() throws InterruptedException
   {
	   Utility.implicitWait(1000, driver);
       dash.logOutFromNeoStox();
   }
   
   @AfterClass
   public void closeBrowser() throws InterruptedException
   {
	   driver.close();
	   Reporter.log("Cloing application",true);
	   Thread.sleep(1000);
   }
   
}
