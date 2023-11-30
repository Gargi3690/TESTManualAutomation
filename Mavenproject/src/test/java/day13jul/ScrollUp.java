package day13jul;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ScrollUp {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		JavascriptExecutor js =  (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,1000);", "");
		
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,-1000);", "");
		//driver.close();
	}
	
}
