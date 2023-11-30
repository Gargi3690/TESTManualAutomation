package day13jul;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
public class FluentWaitDemo {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.className("gLFyf")).sendKeys("facebook");
		
		FluentWait<WebDriver> wait = new FluentWait<>(driver);
		wait.withTimeout(Duration.ofSeconds(4));
		wait.pollingEvery(Duration.ofMillis(500));
	    wait.ignoring(NoSuchElementException.class);
	    
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//span[text()='facebook'])[1]")));
		
		String txt = driver.findElement(By.xpath("(//span[text()='facebook'])[1]")).getText();
		
		System.out.println("Text :" +txt);
	}
	
}
