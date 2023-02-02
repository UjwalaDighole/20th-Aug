package testNGxmlStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NeoStox4
{
  @Test(groups = "sanity")
  public void f() 
  {
	  Reporter.log("TC f is running", true);
  }
  
  @Test(groups = "sanity")
  public void i() 
  {
	  Reporter.log("TC i is running", true);
  }
  
  @Test(groups = "reg")
  public void h() 
  {
	  Reporter.log("TC h is running", true);
  }
  
  @Test(groups = "reg")
  public void j() 
  {
	  Reporter.log("TC j is running", true);
  }
  
  @Test
  public void g() 
  {
	  Reporter.log("TC g is running", true);
  }
}
