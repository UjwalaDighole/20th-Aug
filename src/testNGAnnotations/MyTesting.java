package testNGAnnotations;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Reporter;

public class MyTesting
{
  @Test
  public void validateUserID() 
  {
	  Reporter.log("validateUserID is running",true);
  }
  
  @Test
  public void validateACBalance()
  {
	  Reporter.log("validateACBalance is running",true);
  }
  @BeforeMethod
  public void loginToNeostox() 
  {
	  Reporter.log("Logged in",true);
  }


}
