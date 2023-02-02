package popUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (1)\\chromedriver.exe");

		//created object of ChromeDriver
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		//launch url
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(1000);
       driver.findElement(By.name("submit")).click();
       Thread.sleep(500);
       //handle alert pop up-->
       Alert alt=driver.switchTo().alert();
       Thread.sleep(1000);
       //  alt.accept();  //clicking on ok button
       //
       //  alt.accept();  //clicking on ok button
       
       System.out.println(alt.getText());  //getting Alert pop up text
       Thread.sleep(500);
       alt.dismiss();  //click on cancel button
       
     String text= driver.findElement(By.xpath("//h2[text()='Guru99 Bank']")).getText();
       
     System.out.println("text is"+text);
       
	}

}
