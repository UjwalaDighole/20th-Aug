package dataProvider;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import neoStoxBase.Base;
import neoStoxUtility.Utility;
import testNGneoStoxPOMClassesUsingDDF.NeoStoxDashBoardPage;
import testNGneoStoxPOMClassesUsingDDF.NeoStoxHomePage;
import testNGneoStoxPOMClassesUsingDDF.NeoStoxPasswordPage;
import testNGneoStoxPOMClassesUsingDDF.NeoStoxSignInPage;

@Listeners(neoStoxTestClasses.Listner.class)

public class ValidateNeoStoxUserNameUsingPropertyFile extends Base
{
	NeoStoxDashBoardPage dash ;
	  NeoStoxHomePage home;
	  NeoStoxSignInPage signIn;
	  NeoStoxPasswordPage pass;
	  
  @BeforeMethod
   public void launchNeoStoxApp ()
  {
	  launchBrowser();
	  home = new NeoStoxHomePage(driver);
	  signIn= new NeoStoxSignInPage(driver);
	  pass= new NeoStoxPasswordPage(driver);
	  dash= new NeoStoxDashBoardPage(driver);
	  
   }
  
	  //Note: TestNG comes up with DataProvider to automate the process of providing test cases for execution.
	  //DataProvider helps with data-driven test cases that carry the same methods but can be run multiple times with different data sets.
	  //It also helps in providing complex parameters to the test methods.
	
   @Test(dataProvider = "loginDetailsforValidateUserName")
	   public void validateUserName(String mobNum,String password,String userName) throws InterruptedException
	  
	  {
	  home.clickOnSignInButton();
	  Utility.implicitWait(1000, driver);
	  signIn.enterMobileNumber(mobNum);
	  Thread.sleep(1000);
	  signIn.clickOnSignInButton();
	  Utility.implicitWait(1000, driver);
	  
	  pass.enterPassword(password);
	  pass.clickOnSubmitButton();
	  Utility.implicitWait(1000, driver);
	  dash.handlePopUp();
	  
	  Assert.assertEquals(dash.getActualUserName(), userName,"Actual and Expected user Names are not matching TC is failed");
	  dash.logOutFromNeoStox();
	  }
   
	  @Test(dataProvider = "loginDetailsForValidateAccountBalance")
	   public void validateACBalance(String mobNum,String password) throws
	  EncryptedDocumentException, IOException, InterruptedException
	  {
	  home.clickOnSignInButton();
	  Utility.implicitWait(1000, driver);
	  
	  signIn.enterMobileNumber(mobNum);
	  Thread.sleep(1000);
	  signIn.clickOnSignInButton();
	  
	  Utility.implicitWait(1000, driver);
	  pass.enterPassword(password);
	  pass.clickOnSubmitButton();
	  
	  Utility.implicitWait(1000, driver);
	  dash.handlePopUp();
	  Assert.assertNotNull(dash.getAcBalance(),"AC balance is null, TC is failed");
	  dash.logOutFromNeoStox();
	  }
	  
  @AfterMethod
  public void closeNeoStoxApp() throws InterruptedException
  {
	  driver.close();
	  Reporter.log("Closing application", true);
	  Thread.sleep(1000);
	}

	  @DataProvider(name="loginDetailsforValidateUserName")
	  public String[][] getLoginDetails1()
	  {
	  String userData[][]= {{"9421357890","9839","Hi Ujwala"},{"7387901637","9362","Hi Ankush More"},{"8805568380","2303","Hi Pooja Talekar"}};
	  return userData;
	  }

	  @DataProvider(name="loginDetailsForValidateAccountBalance")
	  public String[][] getLoginDetails2()
	  {
	  String userData[][]=
	 {{"9421357890","9838"},{"7387901637","9362"},{"8805568380","2303"}};
	  
	  return userData;
	  }
}
