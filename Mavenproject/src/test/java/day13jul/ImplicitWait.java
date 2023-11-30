package day13jul;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.findElement(By.className("gLFyf")).sendKeys("facebook");
		
		Thread.sleep(3000);
		
	    String txt =driver.findElement(By.xpath("(//span[text()='facebook'])[1]")).getText();
	    System.out.println("Text :" +txt);
	    
	}
}
