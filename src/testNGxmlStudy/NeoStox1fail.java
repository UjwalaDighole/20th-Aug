package testNGxmlStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class NeoStox1fail {
	
	  @Test
	  public void a()
	  {
		  Reporter.log("TC a is running", true);
	  }
	  
	  @Test
	  public void b()
	  {
		  Reporter.log("TC b is running", true);
	  }
	  
	  @Test
	  public void c()
	  {
		//Assert.fail();
		  Reporter.log("TC c is running", true);
	  }
	  
	  @Test
	  public void d()
	  {
		  Assert.fail();
		  Reporter.log("TC d is running", true);
	  }
	  
	  @Test
	  public void e()
	  {
		  Reporter.log("TC e is running", true);
	  }
	

}
