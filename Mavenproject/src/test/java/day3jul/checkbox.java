package day3jul;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	
	public static void main(String[] args) throws InterruptedException
	{
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://www.letskodeit.com/practice");
	
	       driver.manage().window().maximize();
	       
	       
			/*
			 *webElement is an interface
			 * WebElement element1 = driver.findElement(By.id("bmwcheck"));
			 * element1.click();
			 * 
			 * Thread.sleep(1000);
			 * 
			 * element1 = driver.findElement(By.id("benzcheck")); element1.click();
			 * 
			 * Thread.sleep(1000);
			 * 
			 * element1 = driver.findElement(By.id("hondacheck")); element1.click();
			 */
	     
	       
	       
	       driver.findElement(By.id("bmwcheck")).click(); //method chaining
	       Thread.sleep(1000);
	       
	       driver.findElement(By.id("benzcheck")).click();
	       
	       Thread.sleep(1000);
	       
	       driver.findElement(By.id("hondacheck")).click();
	       driver.close();
	}
}
