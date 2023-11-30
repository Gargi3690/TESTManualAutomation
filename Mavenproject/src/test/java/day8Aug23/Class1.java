package day8Aug23;

import org.testng.annotations.Test;

public class Class1 {

	
	@Test(dataProvider="DP1",dataProviderClass=DP.class)
	public void test1(String username,String password)
	{
		System.out.println(username + ":" +password);
	}
	
}
