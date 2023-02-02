package neoStoxPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import neoStoxUtility.Utility;

public class NeoStoxDashBoardPage 
{
	@FindBy(xpath = "(//a[text()='OK'])[2]") private WebElement popUpOkButton;
	
	//@FindBy(xpath = "(//a[text()='Close'])[5]") private WebElement popUpCloseButton;
	
	@FindBy(id = "lbl_username") private WebElement userName;
	
	@FindBy(xpath = "//span[text()='Logout']") private WebElement logOutButton;
	
	@FindBy(id = "lbl_curbalancetop") private WebElement acBalance;
	public NeoStoxDashBoardPage(WebDriver driver)
	{
	     PageFactory.initElements(driver, this);
	}
	
	public void handlePopUp(WebDriver driver) throws InterruptedException
	{
	
		Thread.sleep(5000);
		
		if (popUpOkButton.isDisplayed())
		{
		Utility.scrollIntoView(driver,popUpOkButton);
		popUpOkButton.click();
		Reporter.log("clicking on PopUp OK button", true);
		
//		Thread.sleep(500);
//		
//		Utility.scrollIntoView(driver, popUpCloseButton);
//		popUpCloseButton.click();
//		Reporter.log("clicking on PopUp closeButton", true);
		}
		
		else
		{
			Reporter.log("There is no pop up", true);
		}
	}
	
	public void validateUserName()
	{
	String expectedUserName="Hi ujwala dighole";
	String actualUserName = userName.getText();
	
	if(expectedUserName.equals(actualUserName))
		
	{
	  System.out.println("TC is Passed, actual and expected user names are matching ");
	}
	
	else 
	{
	  System.out.println("TC is Failed, actual and expected user names are not matching ");
	}
	
	}
	public void logOutFromNeoStox() throws InterruptedException
	{
	userName.click();
	Thread.sleep(1000);
	logOutButton.click();
	}

	
	public String getAcBalance()
	{
		String balance = acBalance.getText();
		Reporter.log("getting AC Balance", true);
		Reporter.log("Account balance is "+balance, true);
		return balance;
	}

	public String getActualUserName()
	{
		{
			String actualUserName = userName.getText();
			Reporter.log("Getting Actual UserName", true);
			Reporter.log("Actual user name is --> "+actualUserName, true);
			return actualUserName;
		}
		
	}	

}
