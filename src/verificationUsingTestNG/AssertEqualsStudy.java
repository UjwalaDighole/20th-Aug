package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqualsStudy {
  @Test
  public void f() 
  {
	  String a="abc";
	  String b="abc";
	  
	  Assert.assertEquals(a,b,"a and b are not matching, TC failed");
  }
}
