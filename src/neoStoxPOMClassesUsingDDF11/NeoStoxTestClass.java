package neoStoxPOMClassesUsingDDF11;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NeoStoxTestClass {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");

		//created object of ChromeDriver
	
		 WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//launch url
		driver.get("https://neostox.com/");
		
		File myFile = new File("F:\\excel uju.xlsx");
	    Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet5");
	    
	    String mobNum = mySheet.getRow(0).getCell(0).getStringCellValue();
	    String PW = mySheet.getRow(0).getCell(1).getStringCellValue();
	    String expectedUserName = mySheet.getRow(0).getCell(2).getStringCellValue();
	    
		//create an object of home page
		NeoStoxHomePage home=new NeoStoxHomePage(driver);
		home.clickOnSignInButton();
		
		//signIn Page
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		NeoStoxSignInPage signIn = new NeoStoxSignInPage(driver);
		signIn.enterMobileNumber(mobNum);
		signIn.clickOnSignInButton();
		
		//password page
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		NeoStoxPasswordPage password= new NeoStoxPasswordPage(driver);
		password.enterPassword(PW);
		password.clickOnSubmitButton();
		
		//dashBoard Page
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		NeoStoxDashBoardPage dashBoard= new NeoStoxDashBoardPage(driver);
		dashBoard.handlePopUp();
		dashBoard.validateUserName(expectedUserName);
		dashBoard.logOutFromNeoStox();
		
		driver.close();
		
}


}
