package day4Aug23;

import org.testng.annotations.Test;

public class HelpingAttributes1 {

	
	@Test(priority=0)
	public void NykaTest()  //test method
	{
		System.out.println("NyKa test is executed");
	}
	
	@Test(priority=124)
	public void MyntraTest()  //test method
	{
		System.out.println("Myntra test is executed");
	}
	
	@Test(priority=78)
	public static void Zudio()
	{
		System.out.println("Welcome To zudio!!!!");
	}
	
}
