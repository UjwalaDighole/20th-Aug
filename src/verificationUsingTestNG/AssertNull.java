package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNull {
  @Test
  public void nullCheck() 
  {
	  String a="a";
	  
	  Assert.assertNull(a,"a value is not null, TC is failed");
  }
}
