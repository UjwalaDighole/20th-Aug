package neoStoxPOMClasses11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeoStoxPasswordPage 
{
	@FindBy(id ="txt_accesspin")private WebElement passwordField;
			
	@FindBy(id ="lnk_submitaccesspin")private WebElement submitButton;
	
	public NeoStoxPasswordPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterPassword()
	{
		passwordField.sendKeys("3007");
		
	}
	
	public void clickOnSubmitButton() throws InterruptedException 
	{
		Thread.sleep(500);
		submitButton.click();
	}
}
