package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedUse {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");

		//created object of ChromeDriver
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
        //launch url
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//thread(1000);
		
		 WebElement checkBox1 = driver.findElement(By.id("checkBoxOption1"));
		
		checkBox1.click();
		if(checkBox1.isSelected())
		{
			System.out.println("checkBox is already selected");
		}
		else
		{
			System.out.println("Checking checkBox now");
			checkBox1.click();
			System.out.println("CheckBox is selected now");
		}
	}

}
