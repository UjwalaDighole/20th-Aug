package testNGKeyWords;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class InvocationCount 
{
  @Test (invocationCount=5)
  public void myTest()
  {
	  Reporter.log("MyTest is running",true);
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  Reporter.log("beforeMethod is running",true);
  }

  @AfterMethod
  public void afterMethod() 
  {
	  Reporter.log("afterMethod is running",true);
  }

}
