package day14jul23;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ActionClass1 {

	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		WebElement txt = driver.findElement(By.id("autosuggest"));
		
		Actions action = new Actions(driver);
		action.sendKeys(txt, "Gouri").build().perform();
		
		Thread.sleep(3000);
		
		WebElement openwindow = driver.findElement(By.id("openwindow"));
		action.moveToElement(openwindow).click().perform();
		
		Thread.sleep(3000);
		
		
		WebElement opentab = driver.findElement(By.id("opentab"));
		action.moveToElement(opentab).click().perform();
		
		Thread.sleep(3000);
		
		
		driver.quit();
	}
	
	
}
