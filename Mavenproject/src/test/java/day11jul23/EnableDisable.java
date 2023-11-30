package day11jul23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnableDisable {
	
	  static WebDriver driver;
	private static WebDriver LaunchBrowser() {
		driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		return driver;
	}
	
	private static WebElement getElement(By by)
	{
		 return driver.findElement(by);
	}

	public static void main(String[] args) throws InterruptedException
	{
		LaunchBrowser();
		
		WebElement element = getElement(By.id("enabled-example-input"));

		element.sendKeys("Gouri");
		
		Thread.sleep(3000);

		
       System.out.println("Enabled :" +getElement(By.id("enabled-example-input")).isEnabled());
		
		
		  
	    getElement(By.id("disabled-button")).click();
	    System.out.println("Disabled :" +element.isEnabled());
		  
		  
		getElement(By.id("enabled-button")).click();
		System.out.println("Enabled :" +element.isEnabled());
		  
		  
		 
	}

	

}