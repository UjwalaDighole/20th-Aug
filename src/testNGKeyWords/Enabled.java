package testNGKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled {

	@Test
	public void a()
	{
		Reporter.log("TC a is runninng",true);
	}
	
	@Test
	public void b()
	{
		Reporter.log("TC b is runninng",true);
	}
	
	@Test(enabled = false)
	public void c()
	{
		Reporter.log("TC c is runninng",true);
	}
	
	@Test
	public void d()
	{
		Reporter.log("TC d is runninng",true);
	}
	
}

