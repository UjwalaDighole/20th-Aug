package screenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Eg2 {

	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");

		//created object of ChromeDriver
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://paytm.com/");
	// int a=10;
	//	byte b=(byte)a;
     String random = RandomString.make(3);
     
     File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     File destination= new File("F:\\SSD DATA\\automation pdf\\Random"+random+".jpg");
     
     FileHandler.copy(src, destination);
     System.out.println(destination);
	}

}
