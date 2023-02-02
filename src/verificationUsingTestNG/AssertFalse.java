package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFalse {
  @Test
  public void checkFalse()
  {
	  boolean a=true;
	  
	  Assert.assertFalse(a,"a value is true,TC is failed");
  }
}
