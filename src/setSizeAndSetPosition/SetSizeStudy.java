package setSizeAndSetPosition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeStudy {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");

		//created object of ChromeDriver
		WebDriver driver=new ChromeDriver();
		
		//driver.manage().window().maximize();
		//launch url
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
        
		System.out.println(driver.manage().window().getSize());
		Dimension defaultSize = driver.manage().window().getSize();
		System.out.println("Default size is "+defaultSize);
		
		//create object of dimension class
		
		Dimension d=new Dimension(1920, 1080);
		Thread.sleep(1000);
		
		driver.manage().window().setSize(d);
		Dimension newSize = driver.manage().window().getSize();
		System.out.println("new Size is "+newSize);
	}

}
