package testNGKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods 
 {
  @Test(enabled = false)
  public void b() 
  {
	  //Assert.fail();
	  Reporter.log("TC b is running", true);
  }
  @Test(dependsOnMethods = {"b"})
  public void a()
  {
	  Reporter.log("TC is running", true);
  }
  
  @Test
  public void c()
  {
	  Reporter.log("TC is running", false);
  }
}
