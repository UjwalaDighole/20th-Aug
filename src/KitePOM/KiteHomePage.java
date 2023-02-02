package KitePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage 

	{
		@FindBy(xpath = "//span[@class='user-id']")private WebElement Userid;
       public KiteHomePage(WebDriver driver)
       {
    	   PageFactory.initElements(driver,this);
       }
       
       public void UserIdValidation()
       {
    	  String ActualUserid = Userid.getText();
    	  
    	  String ExpectedUserid = "DV1510";
    	  if(ActualUserid.equals(ExpectedUserid))
    	  {
    		  System.out.println("TC passed user id is matching");
    	  }
    	  
    	  else
    	  {
    		  System.out.println("TC failed user id is not-matching");
    	  }
	}

}
