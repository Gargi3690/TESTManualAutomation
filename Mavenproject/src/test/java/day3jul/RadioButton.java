package day3jul;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.WebElement;

public class RadioButton {

	

		public static void main(String[] args) throws InterruptedException
		{
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.letskodeit.com/practice");
			
			driver.manage().window().maximize();
			
			/*
			 * WebElement element1 = driver.findElement(By.id("bmwradio"));
			 * element1.click();
			 * 
			 * Thread.sleep(3000);
			 * 
			 * element1 = driver.findElement(By.id("benzradio")); element1.click();
			 * 
			 * Thread.sleep(3000);
			 * 
			 * element1 = driver.findElement(By.id("hondaradio")); element1.click();
			 */
			
			driver.findElement(By.id("hondaradio")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("bmwradio")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("benzradio")).click();
			Thread.sleep(2000);
			
			
			driver.close();
		}
}
