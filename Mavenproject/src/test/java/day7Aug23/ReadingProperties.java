package day7Aug23;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

public class ReadingProperties {

	
	public static void main(String[] args) throws IOException
	
	{
		String fn = System.getProperty("user.dir") +"/src/test/java/day7Aug23/config.properties";
	    FileInputStream fis = new FileInputStream(fn);
	    Properties prop = new Properties();
	    prop.load(fis);
	    
	    String user = prop.getProperty("user");
	    System.out.println("user:" +user);
	    
	    String password = prop.getProperty("password");
	    System.out.println("password :" +password);
	    
	    String to = prop.getProperty("timeout");
	    System.out.println("timeout :" +to);
	    System.out.println(Integer.parseInt(to)+10);
	    
	    System.out.println(prop.getProperty("maxWindow"));
	    
	    String rc = prop.getProperty("responsecode");
	    System.out.println(rc);
	    
	    String[] rcs = rc.split(",");
		for (String resCode : rcs) 
		{
			System.out.println(Integer.parseInt(resCode) + 100);
		}
		
		
        Map<String,String> map = new HashMap<>();
		
		for (Entry<Object, Object> entry: prop.entrySet()) 
		{
			System.out.println(entry.getKey() + " = " + entry.getValue());
			map.put((String) entry.getKey(), (String) entry.getValue());
		}
		
		System.out.println(map);
	}
}
