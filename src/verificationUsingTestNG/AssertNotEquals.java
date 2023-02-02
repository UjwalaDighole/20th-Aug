package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotEquals {
  @Test
  public void notEquals() 
  {
	  String a="abc";
	  String b="abcd";
	  
	  Assert.assertEquals(a,b,"a and b are equals, TC is failed");
  }
  
}
