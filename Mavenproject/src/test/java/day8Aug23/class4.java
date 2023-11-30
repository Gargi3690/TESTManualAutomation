package day8Aug23;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class4 {

	
	@Test
	public void Test_3()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.quit();
	}
	
	@Test
	public void Test_4()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.quit();
	}
}
