package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FailCheck {
  @Test
  public void fail()
  {
	  Assert.fail();
	  
	  Reporter.log("HI Good evening",true);
  }
}
