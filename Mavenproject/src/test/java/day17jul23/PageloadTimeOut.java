package day17jul23;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class PageloadTimeOut {

	
	public static void main(String[] args)
	{
		/*
		 * WebDriver driver = new ChromeDriver();
		 * driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));
		 * driver.get("https://www.facebook.com/"); driver.manage().window().maximize();
         */
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		
		
	}
	
	
	
}
