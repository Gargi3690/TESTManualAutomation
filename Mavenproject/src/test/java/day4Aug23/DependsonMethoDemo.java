package day4Aug23;

//import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsonMethoDemo {

	
	@Test
	public void reg()
	{
		System.out.println("Registration of a user");
	}
	
	@Test(dependsOnMethods = {"reg"})
	public void login()
	{
		//Assert.fail();
		System.out.println("Login of user");
	}
	
	@Test(dependsOnMethods = {"reg"}, alwaysRun = false)
	public void logout()
	{
		System.out.println("Logout the user");
	}
}
