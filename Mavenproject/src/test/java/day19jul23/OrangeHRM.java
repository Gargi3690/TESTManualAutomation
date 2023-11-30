package day19jul23;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHRM {

	
	public static void main(String[] args)
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("------headless");
		
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
	}
}
