package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class KeywordPriority {
  @Test
  public void C()
  {
	  Reporter.log("C is running",true);
 
  }

@Test 
public void A()
{
Reporter.log("A is running",true);
}
@Test 
public void B() 
{
Reporter.log("B is running",true);
}

}
