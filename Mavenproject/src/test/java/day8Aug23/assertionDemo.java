package day8Aug23;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertionDemo {

	
	@Test
	public void verifyTest()
	{
		 int expAge = 21;
		 int actAge = 11;
		 
			/*
			 * if(expAge == actAge) { System.out.println("test case passed"); } else {
			 * System.out.println("test case failed"); }
			 */
		 
		 Assert.assertEquals(expAge, actAge, "Expected age did not match with actual age !!!!");
		 
		 System.out.println("*********************************");
		 
		 String name1 = "Gouri";
		 String name2 = "Gouri";
		 
		 Assert.assertEquals(name1, name2,"name1 is not matching with name2");
		 
		 int arr1[] = {20,30,40,50};
		 int arr2[] = {20,30,40,50};
		 
		 Assert.assertEquals(arr1, arr2,"arr1 is not matching with arr2");
		  
		List<Integer> al1 = new ArrayList<>(List.of(1,20,3,4,5));
		List<Integer> al2 = new ArrayList<>(List.of(1,20,3,4,5));
		Assert.assertEquals(al1, al2, "al1 is not matching with al2");
		
		Set<String> set1 = new HashSet<>();
		set1.add("Gouri");
		set1.add("Ridhya");
		set1.add("sonu");
		
		
		Set<String> set2 = new HashSet<>();
		set2.add("Gouri");
		set2.add("Ridhya");
		set2.add("sonu");
		
		
		Assert.assertEquals(set1, set2,"set1 is not matching with set2");
		
		
		
		Map<Integer,String> map1 = new HashMap<>();
		Map<Integer,String> map2 = new HashMap<>();
		
		map1.put(1, "Virat");
		map1.put(2, "Rohit");
		map1.put(3, "shikhar");
		
		
		map2.put(1, "Virat");
		map2.put(2, "Rohit");
		map2.put(3, "shikhar");
		
		Assert.assertEquals(map1, map2,"map1 is not matchning with map2");
		
		
		String city1 ="Pune";
		String city2 ="Pune";
		Assert.assertTrue(city1.equals(city2),"error condition is evaluated as true");
		
		
		boolean result = true;
		Assert.assertTrue(result,"error condition found true!!!!");
		
		boolean result1 = false;
		Assert.assertFalse(result1,"error condition found true!!!!");
		
		//Assert.fail("Intentionally failing this test case!!!!!!!!!");
		
		Assert.assertNotEquals(expAge, actAge,"both ages are same");	}
		

}
