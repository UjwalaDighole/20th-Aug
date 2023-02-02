package neoStox;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateNeoStoxUserNameUsingExcel {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\excel uju.xlsx");

		//created object of ChromeDriver
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		//reading data from excel sheet
		File myFile = new File("F:\\excel uju.xlsx");
		
	
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet5");
		String userID = mySheet.getRow(0).getCell(0).getStringCellValue();
		String password = mySheet.getRow(0).getCell(1).getStringCellValue();
		String expUN = mySheet.getRow(0).getCell(2).getStringCellValue();
		//launch neoStox url
		driver.get("https://neostox.com/");
		Thread.sleep(1000);
		//click on SignInButton
		
		driver.findElement(By.xpath("(//a[text()='Sign In'])[1]")).click();
		Thread.sleep(1000);
		//working on SignIN Page
		//1.sending Mobile Number
		driver.findElement(By.xpath("(//input[@type='number'])[1]")).sendKeys(userID);
		//2. clicking on signIn Button
		driver.findElement(By.id("lnk_signup1")).click();
		Thread.sleep(1000);
		//working on password Page
		//1.Entering password
		driver.findElement(By.id("txt_accesspin")).sendKeys(password);
		//2.clicking on SubmitButton
		driver.findElement(By.id("lnk_submitaccesspin")).click();
		//working on homepage
		
		//Handling Hidden div Popup
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[text()='OK'])[2]")).click();
		driver.findElement(By.xpath("(//a[text()='Close'])[5]")).click();
	    Thread.sleep(1000);
		//validating UserName
		String actualUserName = driver.findElement(By.id("lbl_username")).getText();
		

		if(actualUserName.equals(expUN))
		{
		System.out.println("Actual and Expected UserNames are matching, TC passed");
		}
		
		else
		{
		System.out.println("Actual and Expected UserNames are not matching, TC Failed");
		}
		
		//logging out
		Thread.sleep(1000);
		driver.findElement(By.id("lbl_username")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Logout']")).click();
		driver.close();//closing browser
	}

}
