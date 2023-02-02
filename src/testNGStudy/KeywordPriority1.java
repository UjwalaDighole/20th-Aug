package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class KeywordPriority1 {
  @Test(priority = 1)
  public void C() 
  {
	  Reporter.log("C is running",true);
  }
  
@Test(priority = 3) 
public void A()
{
Reporter.log("A is running",true);
}
@Test(priority = 2)
public void B() 
{
Reporter.log("B is running",true);
}

}
