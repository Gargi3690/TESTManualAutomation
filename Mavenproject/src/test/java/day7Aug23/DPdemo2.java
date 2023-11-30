package day7Aug23;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DPdemo2 {

	@Test(dataProvider="GD")
	public void verifyLogin(String username,String password)
	{
		System.out.println(username +":" + password);
	}
	
	@DataProvider( name="GD")
	public Object[][] getData()
	{
		Object[][] data = new Object[2][2];
		
		data[0][0] = "Virat";
		data[0][1] = "Viratpwd"	;
		
		data[1][0] = "Rohit";
		data[1][1] = "Rohitpwd"	;
		
		
		return data;
	}
}
