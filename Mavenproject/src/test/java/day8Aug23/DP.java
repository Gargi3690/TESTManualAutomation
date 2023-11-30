package day8Aug23;

import org.testng.annotations.DataProvider;
public class DP {

	@DataProvider(name="DP1")
	public Object[][] getData1()
	{
		Object[][] data = new Object[4][2];
		data[0][0] = "Virat";
		data[0][1] = "Viratpwd";
		
		data[1][0] = "Gouri";
		data[1][1] = "Gouripwd";
		
		data[2][0] = "Ridu";
		data[2][1] = "Ridupwd";
		
		data[3][0] = "Pidu";
		data[3][1] = "Pidupwd";
		
		return data;
	}
	
	
	@DataProvider(name="DP2")
	public Object[][] getData2()
	{
		Object[][] data= {
				{"Pune",500},
				{"Kolhapur",200},
				{"Nagpur",100}
		};
		return data;
	}
	
}
