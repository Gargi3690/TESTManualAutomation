package day18jul23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardHandling {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)", "");
		
		WebElement first = driver.findElement(By.id("userName"));
		first.sendKeys("Gouri");
		
		first = driver.findElement(By.id("userEmail"));
		first.sendKeys("abc@gmail.com");
		
		WebElement address = driver.findElement(By.id("currentAddress"));
		address.sendKeys("pune,14");
		
		String k = Keys.chord(Keys.CONTROL,"a");
		address.sendKeys(k);
		
		k = Keys.chord(Keys.CONTROL,"c");
		address.sendKeys(k);
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.TAB).build().perform();
		
		
	   WebElement perAddress =driver.findElement(By.id("permanentAddress"));
	   k = Keys.chord(Keys.CONTROL,"v");
	   perAddress.sendKeys(k);
	   
	   perAddress.clear();
		
		
		
		
	}
	
}
