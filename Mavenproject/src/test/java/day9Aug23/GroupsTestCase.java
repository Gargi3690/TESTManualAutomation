package day9Aug23;

import org.testng.annotations.Test;

public class GroupsTestCase {

	
	@Test(groups = {"Cars","Vehicles"})
	public void TestAudi()
	{
		System.out.println("cars: TestAudi browser:");
	}
	
	@Test(groups = {"Cars"})
	public void TetstCarmy()
	{
		System.out.println("cars: TestCarmy");
	}
	
	@Test(groups = {"Bikes"})
	public void TestHonda()
	{
		System.out.println("cars : TestHonda");
	}
	
	
	@Test
	public void TestYamah()
	{
		System.out.println("cars : TestYamah");
	}
	
	@Test
	public void TestSuzuki()
	{
		System.out.println("cars : TestSuzuki");
	}
	
	@Test
	public void TestActiva()
	{
		System.out.println("cars : TestActiva");
	}
}
