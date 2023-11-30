package day7Aug23;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DPdemo {

	@Test(dataProvider="GD")
	public void verifyLogin(String username,String password)
	{
		System.out.println(username +":" + password);
	}
	
	@DataProvider( name="GD")
	public String[][] getData()
	{
		String[][] data = new String[4][2];
		
		data[0][0] = "Virat";
		data[0][1] = "Viratpwd"	;
		
		data[1][0] = "Rohit";
		data[1][1] = "Rohitpwd"	;
		
		data[2][0] = "Omkar";
		data[2][1] = "Omkarpwd"	;
		
		data[3][0] = "Shikhar";
		data[3][1] = "Shikharpwd"	;
		return data;
	}
}
