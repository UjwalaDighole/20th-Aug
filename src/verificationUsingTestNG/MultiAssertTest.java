package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiAssertTest 
{
	String a=null;
	String b="abc";
	String c="abc";
  @Test
  public void notNullCheck() 
  {
	  Assert.assertNotNull(b,"b value is null TC is failed");
	  Assert.assertNotNull(a,"a value is null TC is failed");
  }
  @Test
  public void equalsCheck()
  {
	  Assert.assertEquals(a,b,"a and b are not matching, TC is failed");
	  Assert.assertEquals(b,c,"b and c are not matching, TC is failed");
  }
}
