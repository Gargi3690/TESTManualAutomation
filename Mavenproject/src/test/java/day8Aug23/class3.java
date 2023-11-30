package day8Aug23;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class3 {

	
	@Test
	public void Test_1()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.quit();
	}
	
	@Test
	public void Test_2()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.quit();
	}
}
