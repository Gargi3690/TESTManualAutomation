package day8Aug23;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssert {

	
	@Test
	public void test1() 
	{
	
		System.out.println("This is the first line of a program");
		
		SoftAssert sa = new SoftAssert();
		int a = 10,b = 11;
		sa.assertEquals(a, b,"a and b are not equal");
		String s1 = "Gouri";
		String s2 = "Ridhya";
		
		sa.assertEquals(s1, s2,"s1 and s2 are not equal");
		
		float x = 13.35f;
		float y = 13.35f;
		sa.assertEquals(x, y, "x and y are not equal");
		
		System.out.println("This is the last line of program");
		//sa.assertAll();
		
	}
}
