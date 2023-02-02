package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotNull {
  @Test
  public void notNullCheck() 
  {
	  String a=null;
	  Assert.assertNotNull(a,"a value is null, TC is failed");
  }
}
