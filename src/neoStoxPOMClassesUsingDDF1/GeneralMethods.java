package neoStoxPOMClassesUsingDDF1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class GeneralMethods 
{
      //excel
	  //wait
	//screenshot
	//scrollIntoview
	
	public static String readDataFromExcel(int row, int cell) throws EncryptedDocumentException, IOException
	
	{
		File myFile = new File("F:\\excel uju.xlsx");
	    Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet5");
	    String value = mySheet.getRow(row).getCell(cell).getStringCellValue();
	    return value;
	}
	public static void implicitWait(int time, WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(time));
	}
	
	public static void takeScreenshot(WebDriver driver,String fileName) throws IOException
	{
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  File dest = new File("F:\\ScreenShot\\"+fileName+".png");
		  
		  FileHandler.copy(src,dest);
		  
	}
	
	public static void scrollIntoView(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
}
