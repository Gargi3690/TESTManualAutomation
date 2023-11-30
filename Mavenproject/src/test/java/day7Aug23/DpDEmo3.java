package day7Aug23;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DpDEmo3 {

	
	@Test(dataProvider="GD")
	public void verifyLogin(HashMap<String,String>map)
	{
		System.out.println(map.get("user") +":" +map.get("pwd"));
	}
	
	@DataProvider(name="GD")
	public Object[] getData()
	{
		Object[] data = new Object[3];
		
		Map<String,String> map1 = new HashMap<>();
		
	   map1.put("user", "Virat");
	   map1.put("pwd", "Viratpwd");
	   
	   data[0] = map1;
	   
	   
	   Map<String,String> map2 = new HashMap<>();
		
	   map2.put("user", "Rohit");
	   map2.put("pwd", "Rohitpwd");
	   
	   data[1] = map2;
	   
	   Map<String,String> map3 = new HashMap<>();
	   map3.put("user", "Omkar");
	   map3.put("pwd", "Omkarpwd");
	   
	   data[2] = map3;
		
		return data;
		
	}
}
