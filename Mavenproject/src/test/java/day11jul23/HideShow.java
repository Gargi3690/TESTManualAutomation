package day11jul23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HideShow {

	public static void main(String[] args) throws InterruptedException
	{
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://www.letskodeit.com/practice");
	       driver.manage().window().maximize();
	       
	       
	       WebElement element = driver.findElement(By.id("displayed-text"));
	       element.sendKeys("Gouri");
	       
	       boolean res = element.isDisplayed();
	       System.out.println("Result is:" +res);
	       
	       Thread.sleep(3000l);
	       
	       driver.findElement(By.id("hide-textbox")).click();
	       
	       res = element.isDisplayed();
	       System.out.println("Result is (hide):" +res);
	       
	       Thread.sleep(3000l);
	       driver.findElement(By.id("show-textbox")).click();
	       
	       res = element.isDisplayed();
	       System.out.println("Result is (show):" +res);
	       
	}
	
}
