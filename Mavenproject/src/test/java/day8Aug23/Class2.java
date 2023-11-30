package day8Aug23;

import org.testng.annotations.Test;

public class Class2 {

	
	@Test(dataProvider="DP2",dataProviderClass=DP.class)
	public void test2(String city,String age)
	{
		System.out.println(city + ":" +age);
	}
	
}
