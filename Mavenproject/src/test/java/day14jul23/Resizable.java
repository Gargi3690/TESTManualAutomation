package day14jul23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {

	
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.findElement(By.xpath("//a[text()='Resizable']")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeAsyncScript("window.scrollBy(0,400)","");
		
		driver.switchTo().frame(0);
		
		WebElement resize = driver.findElement(By.xpath("//*[@id='resizable']/div[3]"));
		
		Actions action = new Actions(driver);
		//action.moveToElement(resize).dragAndDropBy(resize, 0, 300).perform();
		
		action.clickAndHold(resize).moveByOffset(300, 400).release(resize).perform();
		
	}
}
