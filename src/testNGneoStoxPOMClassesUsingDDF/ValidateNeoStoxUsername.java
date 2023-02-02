package testNGneoStoxPOMClassesUsingDDF;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class ValidateNeoStoxUsername {
  WebDriver driver;
  NeoStoxHomePage home;
  NeoStoxSignInPage signIn;
  NeoStoxPasswordPage pwd;
  NeoStoxDashBoardPage dash;
   File myFile;
   Sheet mySheet;
  
	@BeforeClass
	
  public void launchNestoxApp() throws EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");

		//created object of ChromeDriver
	
		 WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//launch url
		driver.get("https://neostox.com/");
		Reporter.log("Launching NeostoxApp",true);
		
		home=new NeoStoxHomePage(driver);
		signIn=new NeoStoxSignInPage(driver);
		pwd=new NeoStoxPasswordPage(driver);
		dash=new NeoStoxDashBoardPage(driver);
		
		myFile=new File("F:\\excel uju.xlsx");
		mySheet= WorkbookFactory.create(myFile).getSheet("Sheet5");
	}
		@BeforeMethod
		public void loginToNeoStox() throws InterruptedException
		{
		home.clickOnSignInButton();
		Reporter.log("Clicking on sign in Button",true);
		Thread.sleep(1000);
		signIn.enterMobileNumber(mySheet.getRow(0).getCell(0).getStringCellValue());
		Reporter.log("Entering mobile number",true);
		Thread.sleep(1000);
		
		signIn.clickOnSignInButton();
		Reporter.log("Clicking on sign in Button",true);
		Thread.sleep(1000);
		
		pwd.enterPassword(mySheet.getRow(0).getCell(1).getStringCellValue());
		Reporter.log("Entering pwd",true);
		Thread.sleep(1000);
		
		pwd.clickOnSubmitButton();
		Reporter.log("Clicking on submit Button",true);
		Thread.sleep(2000);
		dash.handlePopUp();
		
		Reporter.log("Handling popup",true);
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		//Assert.fail();
  }
		@Test
		 public void validateUserName()
		{
		String expectedUserName =
		mySheet.getRow(0).getCell(2).getStringCellValue();
		String actualUserName = dash.getActualUserName();
		Reporter.log("Validating UserName ", true);
		Assert.assertEquals(actualUserName, expectedUserName,"actual and expected UserNames are not Matching TC is failed");
		}
		
		@AfterMethod
		public void logOutFromNeoStox() throws InterruptedException
		{
		Thread.sleep(1000);
		dash.logOutFromNeoStox();
		Reporter.log("logging out from neoStox", true);
		Thread.sleep(1000);
		}
		
		@AfterClass
		public void closeBrowser()
		{
         driver.close();
		Reporter.log("Closing browser", true);
}
}