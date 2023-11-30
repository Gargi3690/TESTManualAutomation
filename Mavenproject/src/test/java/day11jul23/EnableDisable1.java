package day11jul23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnableDisable1 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();

		WebElement element = driver.findElement(By.id("enabled-example-input"));

		element.sendKeys("Gouri");

		boolean res = element.isEnabled();
		System.out.println("Result is :" + res);

		
		  Thread.sleep(3000l);
		  
		  driver.findElement(By.id("disabled-button")).click();
		  
		  
		  res =element.isEnabled(); System.out.println("Result is (disable) :" +res);
		  
		  Thread.sleep(3000l);
		 
		  
		  driver.findElement(By.id("enabled-button")).click();
		  
		  res =element.isEnabled(); System.out.println("Result is (disable) :" +res);
	}		 
	
}
