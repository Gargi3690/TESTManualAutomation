package day29aug23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class Automation {

	public static void main(String[] args)
	{
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		
		login(driver);
		
		WebElement element = driver.findElement(By.xpath("//input[@type='email']"));
		
		element.sendKeys("gouri@gmail.com");
		
		/*
		 * String element1= "gouri@gmail.com";
		 * 
		 * Assert.assertEquals(element,
		 * element1,"element is not matching with element1");
		 */
	
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9130958900");
			
	}

	private static void login(WebDriver driver) {
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Gouri");
		
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Mhetri");
		
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Koshti Galli,Kagal");
	}
	
	
}
