package KitePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage 
{
    @FindBy(xpath="//input[@id='pin']")private WebElement pin;
    @FindBy(xpath="//button@class='button-orange wide']")private WebElement ContinueButton;

    public KitePinPage(WebDriver Driver) 
    {
    	PageFactory.initElements(Driver, this);
    }
    
    public void EnterPin()
    {
    	pin.sendKeys("123456");
    }
    
    public void ClickOnContinue()
    {
    	ContinueButton.click();
    }
}
