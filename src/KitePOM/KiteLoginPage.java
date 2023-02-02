package KitePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage
{
      @FindBy(xpath = "//input[@id='userid']")private WebElement UserID;
      @FindBy(xpath = "//input[@id = 'password']")private WebElement PWD;
      @FindBy(xpath = "//button[@class='button-orange wide']")private WebElement LoginButton;
      
      public KiteLoginPage (WebDriver driver)
      {
    	  PageFactory.initElements(driver, this);
      }
      public void EnterUserID()
      {
    	  UserID.sendKeys("DV1510");
      }
      public void EnterPassword()
      {
    	  PWD.sendKeys("Year@123");
      }
      public void ClickOnLoginButton()
      {
    	  LoginButton.click();
      }
}
