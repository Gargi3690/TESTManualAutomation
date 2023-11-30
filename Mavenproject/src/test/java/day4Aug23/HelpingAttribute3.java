package day4Aug23;
import org.testng.annotations.Test;

public class HelpingAttribute3 {

	@Test(description="this test case verify price of an Item")
	public void verifyItemPrice()
	{
		System.out.println("Item Price : 100");
	}
	

	@Test(description="This test case verify Name of An Item")
	public void verifyItemZame()
	{
		System.out.println("Item Name:Lamp");
	}
	
	@Test(invocationCount = 5)
	public void  GenerateData()
	{
		System.out.println("Gouri_" +System.currentTimeMillis());
		}
	
	@Test(timeOut = 1)
	public void timeOutTest() throws InterruptedException
	{
		//Thread.sleep(3000l);
		System.out.println("Time test is executed");
	}
	
	@Test(enabled = true)
	public void verifyPriceForMobile()
	{
		System.out.println("Test is executed");
	}
	
	
	@Test(alwaysRun = false)
	public void verifyNameForMobile()
	{
		System.out.println("Mobile Name is excuted");
	}
	
	
	@Test(expectedExceptions = {ArithmeticException.class})
	public void test10()
	{
		System.out.println("********************************8");
		System.out.println(10/0);
	}
	
	
}
