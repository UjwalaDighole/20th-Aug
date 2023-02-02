package verificationUsingTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonValidation {
  @Test
  public void validateRadioButtonStatus() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");

		//created object of ChromeDriver
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//url
		driver.get("https://vctcpune.com/selenium/practice.html");
        Thread.sleep(3000);
       WebElement radio1 = driver.findElement(By.xpath("//input[@value='Radio1']"));
//      if(radio1.isSelected())
//      {
//    	  Reporter.log("Radio 1 is selected TC is passed",true);
//      }
//      else {
//    	  Reporter.log("Radio 1 is not selected TC is Failed");
//      }
 //     radio1.click();
      Assert.assertTrue(radio1.isSelected(),"Radio 1 is not selected TCis Failed");
  }
}
