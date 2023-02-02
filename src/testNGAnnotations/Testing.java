package testNGAnnotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class Testing {
  @Test    //TC-->method
  public void TC1() 
  {
	  Reporter.log("TC1 is running",true);
  }
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  Reporter.log("beforeMethod is rinning",true);
  }

  @AfterMethod
  public void afterMethod() 
  {
	  Reporter.log("after method is running",true);
  }
  
  @Test  //TC-->Method
  
  public void TC2()
  {
	  Reporter.log("TC2 is running",true);
  }

}
