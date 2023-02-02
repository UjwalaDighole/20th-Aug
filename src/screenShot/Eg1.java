package screenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Eg1 {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");

		//created object of ChromeDriver
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://paytm.com/");
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//System.out.println("Current location is "+source);

		    File destination = new File("F:\\ScreenShot\\mansi.png");
		   FileHandler.copy(source, destination);
	}

}
