package selenium_Study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_1 {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32 (1)\\chromedriver.exe");
      
    WebDriver driver=new ChromeDriver();
    
    driver.get("https://instagram.com/");
	}

}
