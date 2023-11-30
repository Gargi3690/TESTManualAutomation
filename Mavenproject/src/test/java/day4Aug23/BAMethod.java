package day4Aug23;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class BAMethod {

	
	@Test
	public void Test1()
	{
		System.out.println("Test1 executed");
	}
	
	@Test
	public void Test2()
	{
		System.out.println("Test2 executed");
	}
	
	@BeforeMethod()
	public void setUp()
	{
		System.out.println("Setup method being called");
	}
	
	
	  @AfterMethod() public void tearDown()
	  {
	  System.out.println("TierDown method being called");
	  }
	 
	
}
