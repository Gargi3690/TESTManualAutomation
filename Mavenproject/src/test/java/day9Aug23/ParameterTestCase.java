package day9Aug23;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTestCase {

	
	@Test
	@Parameters({"browser","env"})
	public void TestAudi1(String browserName,String envName)
	{
		System.out.println("browser1:" + browserName + "Env Name:" +envName);
	}
	
	
	@Test
	@Parameters({"responsecode"})
	public void TestYamah(String responsecode)
	{
		System.out.println("responsecode:" +responsecode);
	}
}
