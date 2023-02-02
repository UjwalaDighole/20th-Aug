package neoStoxPOMClasses11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class NeoStoxHomePage 
	{
	//1 Data member should be declared globally with access level private using @findBy Annotation
       
	@FindBy(xpath="(//a[text()='Sign In'])[1]") private WebElement signInButton;
        
      //2 Initialize within a constructor with access level public using page factory
        public NeoStoxHomePage(WebDriver driver)
        {
        	PageFactory.initElements(driver , this);
        }
        
        //3utilize within a method with access level public
        
        public void clickOnSignInButton() throws InterruptedException
        {
        	signInButton.click();
        	Thread.sleep(1000);
        	Reporter.log("clicking on signin button",true);
        }
	}


