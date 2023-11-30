package day17jul23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverDemo {

		public static void main(String[] args) throws InterruptedException {
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.letskodeit.com/practice");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			Thread.sleep(3000l);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,400)", "");
			
			
			
			Actions actions = new Actions(driver);
			WebElement btnMouseHover = driver.findElement(By.id("mousehover"));
			actions.moveToElement(btnMouseHover).build().perform();
			Thread.sleep(3000l);
			
			driver.findElement(By.xpath("//a[text()='Top']")).click();
			
			Thread.sleep(3000l);
			
			actions.moveToElement(btnMouseHover).build().perform();
			driver.findElement(By.xpath("//a[text()='Reload']")).click();
			
			
			
			
			
			
			
			
			
		}
}


