package setSizeAndSetPosition;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPositionStudy {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");

		//created object of ChromeDriver
		WebDriver driver=new ChromeDriver();
		
		//driver.manage().window().maximize();
		//launch url
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
        System.out.println(driver.manage().window().getPosition());
        
       Point defaultPosition = driver.manage().window().getPosition();
       System.out.println("Default position is "+defaultPosition );
       
       //how to set position?
       // create an object of point class and pass x and y coordinates
       
       Point p=new Point(100, 100);
       Thread.sleep(1000);
        //use set position method and pass point class object as a parameter
       driver.manage().window().setPosition(p);
       
       
	}

}
