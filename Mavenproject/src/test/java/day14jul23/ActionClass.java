package day14jul23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ActionClass {

	public static void main(String[] args) throws InterruptedException
	{
	    WebDriver driver = new ChromeDriver();	
	    driver.get("https://www.letskodeit.com/practice");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	    
	    JavascriptExecutor js =  (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,500)", "");
	    
	    Actions action = new Actions(driver);
	    WebElement mouseOver = driver.findElement(By.id("mousehover"));
	    action.moveToElement(mouseOver).build().perform();
	    
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//a[text()='Top']")).click();
	    Thread.sleep(5000);
	    
	    js.executeScript("window.scrollBy(0,500)", "");
	    
	    Thread.sleep(5000);
	    
	    action.moveToElement(mouseOver).build().perform();

	    driver.findElement(By.xpath("//a[text()='Reload']")).click();
	    
	    
	    
	    
	}
}
