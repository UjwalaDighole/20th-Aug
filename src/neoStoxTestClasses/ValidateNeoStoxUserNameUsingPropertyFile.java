package neoStoxTestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import neoStoxBase.Base;
import neoStoxPOMClasses.NeoStoxDashBoardPage;
import neoStoxPOMClasses.NeoStoxHomePage;
import neoStoxPOMClasses.NeoStoxPasswordPage;
import neoStoxPOMClasses.NeoStoxSignInPage;
import neoStoxUtility.Utility;

@Listeners(neoStoxTestClasses.Listner.class)
public class ValidateNeoStoxUserNameUsingPropertyFile extends Base{
  
  NeoStoxDashBoardPage dash ;
  NeoStoxHomePage home;
  NeoStoxSignInPage signIn;
  NeoStoxPasswordPage pass;
  
  @BeforeClass
   public void launchNeoStoxApp()
  {
  launchBrowser();
  home= new NeoStoxHomePage(driver);
  signIn= new NeoStoxSignInPage(driver);
  pass= new NeoStoxPasswordPage(driver);
  dash= new NeoStoxDashBoardPage(driver);
  }
  
  @BeforeMethod
   public void loginToNeoStox() throws InterruptedException, IOException 
  {
  home.clickOnSignInButton();
  Utility.implicitWait(1000, driver);
  
  signIn.enterMobileNumber(Utility.readDataFromPropertyFile("mobile"));
  Thread.sleep(1000);
  signIn.clickOnSignInButton();
  
  Utility.implicitWait(1000, driver);
  
  pass.enterPassword(Utility.readDataFromPropertyFile("password"));
  pass.clickOnSubmitButton();
  
  Utility.implicitWait(1000, driver);
  dash.handlePopUp(driver);
   }
  
  @Test
   public void validateUserName() throws IOException 
   {
     Assert.fail();
     Assert.assertEquals(dash.getActualUserName(), Utility.readDataFromPropertyFile("userName"),"Actual and Expected user Names are not matching TC is failed");
   }

   @Test
   public void validateACBalance()
   {
   Assert.assertNull(dash.getAcBalance(),"AC Balance is null TC failed");
   }
   
    @AfterMethod
    public void logOutFromNeoStox() throws InterruptedException
    {
         dash.logOutFromNeoStox();
    }

    @AfterClass
    public void closeNeoStoxApp() throws InterruptedException
    {
    driver.close();
    Reporter.log("Closing application", true);
    Thread.sleep(1000);
    }
}

