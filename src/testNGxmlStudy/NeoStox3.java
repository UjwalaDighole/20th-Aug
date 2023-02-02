package testNGxmlStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NeoStox3 {
  @Test(groups = "reg")
  public void a() 
  {
	  Reporter.log("TC a is running ", true);
  }
  
  @Test
  public void b() 
  {
	  Reporter.log("TC b is running ", true);
  }
  
  @Test(groups = {"reg","sanity"})
  public void c() 
  {
	  Reporter.log("TC c is running ", true);
  }
  
  @Test(groups = "reg")
  public void d() 
  {
	  Reporter.log("TC a is running ", true);
  }
  
  @Test(groups = "sanity")
  public void e()
  {
	  Reporter.log("TC e is running ", true);
  }
}
