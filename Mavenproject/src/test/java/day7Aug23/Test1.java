package day7Aug23;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {

	@Test
	public void test1_1()
	{
		System.out.println("TEST1-> Test1 is executed");
	}
	
	
	@Test
	public void test1_2()
	{
		System.out.println("TEST1-> Test2 is executed");
	}
	
	

	
	@BeforeMethod()
	public void beforeMethod()
	{
		System.out.println("TEST1-> Before method is executed");
	}
	
	@AfterMethod()
	public void afterMethod()
	{
		System.out.println("TEST1->  after method is executed");
	}
	
	@BeforeClass()
	public void beforeClass()
	{
		System.out.println("TEST1-> before class is executed");
	}
	
	@AfterClass()
	public void afterClass()
	{
		System.out.println("TEST1-> after class is executed");
	}
	
	
	@BeforeTest()
	public void beforeTest()
	{
		System.out.println("TEST1-> before test is excuted");
	}
	
	@AfterTest()
	public void afterTest()
	{
		System.out.println("TEST1-> after test is excuted");
	}
	
	@BeforeSuite()
	public void beforeSuite()
	{
		System.out.println("TEST1-> before suite is executed");
	}
	
	@AfterSuite()
	public void afterSuite()
	{
		System.out.println("TEST1-> after suite is executed");
	}
	
}
